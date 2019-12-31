package com.example.controller;

import com.example.model.Ingredient;
import com.example.model.Order;
import com.example.model.Taco;
import com.example.model.User;
import com.example.repository.IngredientRepository;
import com.example.repository.TacoRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.model.Ingredient.Type;

@Log4j2
@Controller
@RequestMapping("/design")
@SessionAttributes("order")
public class DesignTacoController {

    private IngredientRepository ingredientRepository;
    private TacoRepository tacoRepository;
    @Autowired
    public DesignTacoController(IngredientRepository ingredientRepository, TacoRepository tacoRepository) {
        this.ingredientRepository = ingredientRepository;
        this.tacoRepository = tacoRepository;
    }

    // two end point method both need this
    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredientRepository.findAll().forEach(i -> ingredients.add(i));
        Type[] types = Type.values();
        for(Type type: types) {
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
        }
    }
    @ModelAttribute(name = "order")
    public Order order() {
        return new Order();
    }
    @ModelAttribute(name = "taco")
    public Taco taco() {
        return new Taco();
    }

//    @ModelAttribute(name = "user")
//    public User user(@AuthenticationPrincipal User user) {
//        return user;
//    }
    @GetMapping
    public String showDesignForm(Model model, @AuthenticationPrincipal User user) {
        log.info("   --- Designing taco");
        model.addAttribute("user", user);
        return "design";
    }
    @PostMapping
    public String processDesign(@Valid Taco design, Errors errors,
                                @ModelAttribute Order order) {
        log.info("   --- Saving taco");

        if(errors.hasErrors()) {
            return "design"; // use redirect or not??
        }
        // save the taco design
        Taco saved = tacoRepository.save(design);
        order.addDesign(saved);
        return "redirect:/orders/current";
    }

    private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
       return ingredients.stream()
               .filter(ingredient -> ingredient.getType().equals(type))
               .collect(Collectors.toList());
    }
}

package com.example.controller;

import com.example.model.Ingredient;
import com.example.model.Order;
import com.example.model.Taco;
import com.example.repository.IngredientRepository;
import com.example.repository.TacoRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
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

//     two end point method both need this
    @ModelAttribute
    public void addIngredientsToModel(Model model) {
////        List<Ingredient> ingredients = List.of(
////                new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
////                new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
////                new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
////                new Ingredient("CARN", "Carnitas", Type.PROTEIN),
////                new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
////                new Ingredient("LETC", "Lettuce", Type.VEGGIES),
////                new Ingredient("CHED", "Cheddar", Type.CHEESE),
////                new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
////                new Ingredient("SLSA", "Salsa", Type.SAUCE),
////                new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
////        );
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
    @GetMapping
    public String showDesignForm(Model model) {
//        List<Ingredient> ingredients = new ArrayList<>();
//        ingredientRepository.findAll().forEach(i -> ingredients.add(i));
//        Type[] types = Type.values();
//        for(Type type: types) {
//            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
//        }
//        List<Ingredient> ingredients = new ArrayList<>();
//        ingredientRepository.findAll().forEach(i -> ingredients.add(i));
//        Type[] types = Type.values();
//        for(Type type: types) {
//            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
//        }
        return "design";
    }
    @PostMapping
    public String processDesign(@Valid Taco design, Errors errors, @ModelAttribute Order order) {
        if(errors.hasErrors()) {
//            System.out.println(design);
//            System.out.println(errors.getAllErrors());

            return "design";
        }
        // save the taco design

        log.info("Processing design: " + design);
        log.info(order);
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

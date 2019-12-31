package com.example.controller;

import com.example.model.User;
import com.example.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Log4j2
@Controller
@RequestMapping("/register")
public class RegistrationController {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    @Autowired
    public RegistrationController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public String registerForm() {
        return "registration";
    }

    @PostMapping
    public String processRegistration(@RequestParam Map<String, String> form) {
        User user = new User(
                null,
                form.get("username"),
                passwordEncoder.encode(form.get("password")),
                form.get("fullname"),
                form.get("street"),
                form.get("city"),
                form.get("state"),
                form.get("zip"),
                form.get("phoneNumber")
        );
        User user1 = userRepository.save(user);
        log.info(user1);
        return "redirect:/login";
    }
}

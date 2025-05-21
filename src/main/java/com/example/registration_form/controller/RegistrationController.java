package com.example.registration_form.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

import com.example.registration_form.model.Users;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String registration(Model model) {
        model.addAttribute("users", new Users());
        return "register-form";
    }

    @PostMapping("/register")
    public String processRegistration(@Valid @ModelAttribute("users") Users users,
                                      BindingResult bindingResult,
                                      RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "register-form";
        }

        redirectAttributes.addFlashAttribute("users", users);
        return "redirect:/register-success";
    }


    @GetMapping("/register-success")
    public String registrationSuccess() {
        return "register-success";
    }

}

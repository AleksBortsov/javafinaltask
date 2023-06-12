package com.example.webdemo1206.controllers;

import com.example.webdemo1206.services.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class AuthorController {

    private AuthorService as;

    @GetMapping("/authors")
    public String showAuthors(Model model) {
        model.addAttribute("authors", as.getAuthors());
        return "authors";
    }
}

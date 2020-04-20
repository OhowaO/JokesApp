package com.asperger.jokesapp.controller;

import com.asperger.jokesapp.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", "/jokes", " "})
    private String getRandomJoke(Model model){
        model.addAttribute("joke", this.jokesService.getRandomJoke());
        return "home";
    }
}

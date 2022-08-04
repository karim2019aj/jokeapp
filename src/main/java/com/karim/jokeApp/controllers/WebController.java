package com.karim.jokeApp.controllers;

import com.karim.jokeApp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WebController {
    JokeService jokeService;

    public WebController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getTheJoke(Model model){
        model.addAttribute("Joke",jokeService.getJokeQuote());
        return "jokepage/joke";
    }
}

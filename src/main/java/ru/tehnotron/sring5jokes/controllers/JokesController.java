package ru.tehnotron.sring5jokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.tehnotron.sring5jokes.model.Joke;
import ru.tehnotron.sring5jokes.services.JokeService;

@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", new Joke(jokeService.getJoke()));
        return "index";
    }

}

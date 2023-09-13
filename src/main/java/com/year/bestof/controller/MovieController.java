package com.year.bestof.controller;

import com.year.bestof.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {
    @GetMapping
    public String moviesList(Model model){
       List<Movie> moviesList = getBestMovies();
       model.addAttribute("movies", moviesList);
        return "movies";
    }

    //metodi private
    private List<Movie> getBestMovies(){
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(1, "Barbie"));
        movies.add(new Movie(2, "Come farsi lasciare in 10 giorni"));
        movies.add(new Movie(3, "The menu"));

        return movies;
    }
}

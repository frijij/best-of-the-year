package com.year.bestof.controller;

import com.year.bestof.model.Movie;
import com.year.bestof.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index(Model model){
        String myName = "Francesca";
        model.addAttribute("username", myName);
        return "index";
    }

    @GetMapping("/movies")
    public String moviesList(Model model){
        List<Movie> moviesList = getBestMovies();
        model.addAttribute("movies", moviesList);
        return "movies";
    }


    // metodi private
    private List<Movie> getBestMovies(){
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(1, "Barbie"));
        movies.add(new Movie(2, "Come farsi lasciare in 10 giorni"));
        movies.add(new Movie(3, "The menu"));

        return movies;
    }

    private List<Song> getBestSongs(){
        List<Song> songs = new ArrayList<>();

        songs.add(new Song(1, "Italodisco"));
        songs.add(new Song(2, "Mon Amour"));
        songs.add(new Song(3, "Fragole"));

        return songs;
    }
}

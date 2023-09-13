package com.year.bestof.controller;

import com.year.bestof.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {

    @GetMapping
    public String songs(Model model){
        List<Song> songList=getSongs();
        model.addAttribute("songs", songList);
        return "songs";
    }

    // metodi private
    private List<Song> getSongs(){
        List<Song> songs=new ArrayList<>();
        songs.add(new Song(1,"I hate Javascript"));
        songs.add(new Song(2, "CSS forever"));
        songs.add(new Song(3, "Midnight in Java"));
        return songs;
    }
}

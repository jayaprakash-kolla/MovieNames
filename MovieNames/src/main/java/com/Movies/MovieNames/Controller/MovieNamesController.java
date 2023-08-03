package com.Movies.MovieNames.Controller;

import com.Movies.MovieNames.Service.MovieNamesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Movies.MovieNames.Entity.MovieNames;
import org.springframework.web.bind.annotation.RequestMethod;;

@Controller
@AllArgsConstructor
public class MovieNamesController {

    private MovieNamesService movieNamesService;
   /* @RequestMapping(value = "movies-list",method = RequestMethod.GET)
    public String movieNamesDisplay(ModelMap modelMap){
        Iterable<MovieNames> obj = movieNamesService.fetchMovieDetails();
        modelMap.put("movie_name",obj);
        *//*for(MovieNames movieNames : obj){
            modelMap.put("movie_name",movieNames.getName());
        }*//*
        return "MovieNamesList";
    }*/

    @GetMapping(value = "movies-list")
    public Iterable<MovieNames> movieNamesDisplay(){
        return movieNamesService.fetchMovieDetails();
    }

}

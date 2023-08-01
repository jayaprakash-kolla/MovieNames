package com.Movies.MovieNames.Service;

import com.Movies.MovieNames.Entity.MovieNames;
import com.Movies.MovieNames.Repository.MovieNamesRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MovieNamesService {

    private final MovieNamesRepository movieNamesRepository;
    public void saveMovieDetails(){
        movieNamesRepository.save(new MovieNames(1,"Bro"));
        movieNamesRepository.save(new MovieNames(2,"Baby"));
    }

    public void fetchMovieDetails(){
       MovieNames movieNames = (MovieNames) movieNamesRepository.findAll();

    }






}

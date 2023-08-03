package com.Movies.MovieNames.Service;

import com.Movies.MovieNames.Entity.MovieNames;
import com.Movies.MovieNames.Repository.MovieNamesRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovieNamesService {

    private final MovieNamesRepository movieNamesRepository;
    public void MovieDetails(){
        movieNamesRepository.save(new MovieNames(1,"Bro"));
        movieNamesRepository.save(new MovieNames(2,"Baby"));
    }

    public void saveMovieDetails(){}
    public Iterable<MovieNames> fetchMovieDetails(){
        movieNamesRepository.findAll().forEach(System.out::println);
        return movieNamesRepository.findAll();
    }


}

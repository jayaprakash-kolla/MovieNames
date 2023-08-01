package com.Movies.MovieNames;

import com.Movies.MovieNames.Service.MovieNamesService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieNamesApplication {

	private static MovieNamesService movieNamesService;

	public MovieNamesApplication(MovieNamesService movieNamesService){
		this.movieNamesService=movieNamesService;
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieNamesApplication.class, args);
		movieNamesService.saveMovieDetails();
	}

	public CommandLineRunner Jpa(MovieNamesService movieNamesService){
		return (args) ->{
			movieNamesService.fetchMovieDetails();
		};
	}

}

package com.Movies.MovieNames;

import com.Movies.MovieNames.Service.MovieNamesService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MovieNamesApplication {

	/*private static MovieNamesService movieNamesService;

	public MovieNamesApplication(MovieNamesService movieNamesService){
		this.movieNamesService=movieNamesService;
	}
*/
	public static void main(String[] args) {
		SpringApplication.run(MovieNamesApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner Jpa(MovieNamesService movieNamesService){
		return (args) ->{
			movieNamesService.fetchMovieDetails();
		};
	}*/

}

package com.Movies.MovieNames.Repository;

import com.Movies.MovieNames.Entity.MovieNames;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieNamesRepository extends CrudRepository<MovieNames,Integer> {
}

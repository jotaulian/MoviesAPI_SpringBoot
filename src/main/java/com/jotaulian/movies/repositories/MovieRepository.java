package com.jotaulian.movies.repositories;

import com.jotaulian.movies.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {

}

package com.dh.movie.service;

import com.dh.movie.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findByGenre(String genre);
    Movie saveMovie(Movie movie);
}

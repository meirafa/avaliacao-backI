package com.dh.movie.controller;

import com.dh.movie.model.Movie;
import com.dh.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RefreshScope
@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping()
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
        Movie savedMovie = movieService.saveMovie(movie);
        return ResponseEntity.ok(savedMovie);
    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<Movie>> findByGenre(@PathVariable String genre) {
        List<Movie> movies = movieService.findByGenre(genre);
        return ResponseEntity.ok(movies);
    }
}

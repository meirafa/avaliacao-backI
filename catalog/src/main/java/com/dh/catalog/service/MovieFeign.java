package com.dh.catalog.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="MOVIE")
public interface MovieFeign {

    @GetMapping( "/movies/movies/{genre}")
    ResponseEntity<List<Object>> findMovies(@PathVariable String genre);
}

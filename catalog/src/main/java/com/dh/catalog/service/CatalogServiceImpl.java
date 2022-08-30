package com.dh.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    private MovieFeign movieFeign;

    @Override
    public List<Object> getMoveis(String genre) {
        return movieFeign.findMovies(genre).getBody();
    }
}

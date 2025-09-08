package kku.sqa.service;

import java.util.ArrayList;
import java.util.List;


import kku.sqa.api.MovieService;

public class FavoriteMovie {
    private final MovieService movieService;

    public FavoriteMovie(MovieService movieService) {
        this.movieService = movieService;
    }

    public List<String> getActionMovies(String username) {
    	List<String> movies = new ArrayList<String>();
    	List<String> allMovies = movieService.getMoviesByUser(username);
    	
    	for (String movie: allMovies) {
    		if(movie.contains("Action")) {
    			movies.add(movie);
    		}
    	}
    	return movies;
    }
}

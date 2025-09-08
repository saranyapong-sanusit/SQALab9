package kku.sqa.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.data.stub.*;
import kku.sqa.api.*;


public class FavoriteMovieTestWithStub {

    @Test
    public void testGetActionMovies() {
        MovieService movieService = new MovieServiceStub();
        FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);

        List<String> actionMovies = favoriteMovie.getActionMovies("testUser");

        assertEquals(2, actionMovies.size());
        assertEquals("Action Hero", actionMovies.get(0));
        assertEquals("Action Reloaded", actionMovies.get(1));
    }
}

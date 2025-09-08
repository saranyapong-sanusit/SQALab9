package kku.sqa.service;

import org.junit.jupiter.api.Test;

import kku.sqa.api.MovieService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FavoriteMovieMockitoTest {

    @Test
    public void testGetActionMoviesWithMock() {
        MovieService movieServiceMock = mock(MovieService.class);
        when(movieServiceMock.getMoviesByUser("testUser"))
                .thenReturn(Arrays.asList(
                        "Romantic Movie 1",
                        "Action Hero",
                        "Action Reloaded",
                        "Comedy Night"
                ));

        FavoriteMovie favoriteMovie = new FavoriteMovie(movieServiceMock);

        List<String> actionMovies = favoriteMovie.getActionMovies("testUser");

        assertEquals(2, actionMovies.size());
        assertEquals("Action Hero", actionMovies.get(0));
        assertEquals("Action Reloaded", actionMovies.get(1));
    }
}
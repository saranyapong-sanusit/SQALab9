package kku.sqa.api;

import java.util.List;

public interface MovieService {
    List<String> getMoviesByUser(String username);
}


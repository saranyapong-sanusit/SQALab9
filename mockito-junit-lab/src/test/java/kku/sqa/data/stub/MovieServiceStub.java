package kku.sqa.data.stub;

import java.util.Arrays;
import java.util.List;

import kku.sqa.api.MovieService;

public class MovieServiceStub implements MovieService {

	public List<String> getMoviesByUser(String username){
		return Arrays.asList(
			      "Romantic Movie 1",
			      "Action Hero",
			      "Action Reloaded",
			      "Comedy Night"
			);
	}
}


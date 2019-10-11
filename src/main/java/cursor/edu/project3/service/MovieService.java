package cursor.edu.project3.service;

import cursor.edu.project3.model.Category;
import cursor.edu.project3.model.Movie;

import java.util.List;

public interface MovieService {

    void addNewMovie(Movie movie);

    void deleteMovieById(Long movieId);

    List<Movie> getAllMovies();

    List<Movie> getMoviesByCategory(Category category);
}

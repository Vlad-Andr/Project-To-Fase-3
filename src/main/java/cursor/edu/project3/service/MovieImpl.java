package cursor.edu.project3.service;

import cursor.edu.project3.model.Movie;
import cursor.edu.project3.repo.MovieRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieImpl implements MovieService {

    private final MovieRepo movieRepo;

    public MovieImpl(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    @Override
    public void addNewMovie(Movie movie) {
        movieRepo.save(movie);
    }

    @Override
    public void deleteMovieById(Long movieId) {
        movieRepo.deleteById(movieId);
    }


    @Override
    public List<Movie> getAllMovies() {
        return movieRepo.findAll();
    }

    @Override
    public List<Movie> getMoviesByCategory(String category) {
        return movieRepo.findAllByCategory(category);
    }

}

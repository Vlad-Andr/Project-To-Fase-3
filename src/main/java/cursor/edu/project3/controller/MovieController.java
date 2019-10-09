package cursor.edu.project3.controller;

import cursor.edu.project3.model.Movie;
import cursor.edu.project3.service.MovieImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieController {

    private final MovieImpl movieService;

    public MovieController(MovieImpl movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity addMovie(@RequestBody Movie movie) {
        movieService.addNewMovie(movie);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteMovie(@PathVariable(name = "id") Long id) {
        movieService.deleteMovieById(id);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @GetMapping("getAll")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("{category}")
    public List<Movie> getMoviesByCategory(@PathVariable String category) {
        return movieService.getMoviesByCategory(category);
    }

}

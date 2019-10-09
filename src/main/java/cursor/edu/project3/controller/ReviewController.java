package cursor.edu.project3.controller;

import cursor.edu.project3.model.Review;
import cursor.edu.project3.service.ReviewImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("review")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewImpl reviewService;

    @GetMapping("{movieId}")
    public List<Review> findAllByMovieId(@PathVariable(name = "movieId") Long movieId) {
        return reviewService.findAllByMovieId(movieId);
    }

    @PostMapping("add")
    public ResponseEntity addReview(@RequestBody Review review) {
        reviewService.addReviewToMovie(review);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

}
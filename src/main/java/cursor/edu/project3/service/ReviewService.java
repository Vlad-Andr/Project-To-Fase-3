package cursor.edu.project3.service;

import cursor.edu.project3.model.Review;

import java.util.List;

public interface ReviewService {

    void addReviewToMovie(Review review);

    List<Review> findAllByMovieId(Long movieId);

}

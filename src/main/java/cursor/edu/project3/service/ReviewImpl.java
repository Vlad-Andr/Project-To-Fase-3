package cursor.edu.project3.service;

import cursor.edu.project3.model.Review;
import cursor.edu.project3.repo.ReviewRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewImpl implements ReviewService {

    private final ReviewRepo reviewRepo;

    @Override
    public void addReviewToMovie(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public List<Review> findAllByMovieId(Long movieId) {
        return reviewRepo.findAllById(movieId);
    }

}

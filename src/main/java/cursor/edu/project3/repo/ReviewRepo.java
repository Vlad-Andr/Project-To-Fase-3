package cursor.edu.project3.repo;

import cursor.edu.project3.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReviewRepo extends MongoRepository<Review, Long> {
    List<Review> findAllById(Long id);
}

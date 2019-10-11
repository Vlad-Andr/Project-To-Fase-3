package cursor.edu.project3.repo;

import cursor.edu.project3.model.Category;
import cursor.edu.project3.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo  extends MongoRepository<Movie, Long> {
    List<Movie> findAllByCategory(Category category);
}

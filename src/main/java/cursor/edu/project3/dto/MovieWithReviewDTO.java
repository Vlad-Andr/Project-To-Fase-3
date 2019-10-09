package cursor.edu.project3.dto;

import cursor.edu.project3.model.Movie;
import cursor.edu.project3.model.Review;
import lombok.Data;

import java.util.List;

@Data
public class MovieWithReviewDTO {

    private Movie movie;

    private List<Review> reviews;
}
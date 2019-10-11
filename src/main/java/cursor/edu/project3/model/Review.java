package cursor.edu.project3.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Review {

    @Id
    private Long id;

    private Long movieId;

    private String reviewMessage;

}
package cursor.edu.project3.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Movie {

    @Id
    private Long id;

    private String name;

    private String director;

    private String description;

    private Rate rate;

    private Category category;

}
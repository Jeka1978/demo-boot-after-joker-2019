package hw;

import lombok.Data;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
public class Exam {
    private String title;
    private List<Section> sections;
}

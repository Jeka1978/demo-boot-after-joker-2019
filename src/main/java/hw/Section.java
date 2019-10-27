package hw;

import lombok.Data;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
public class Section {
    private String desc; //
    private List<Exercise> exercises;
}

package programmingSchool.model;

import lombok.Data;

@Data
public class Exercise {

    private int id;
    private String title;
    private String description;

    public Exercise(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Exercise() {
    }
}

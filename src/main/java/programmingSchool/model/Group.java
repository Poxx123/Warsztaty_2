package programmingSchool.model;

import lombok.Data;

@Data
public class Group {

    private int id;
    private String name;

    public Group(String name) {
        this.name = name;
    }

    public Group() {
    }


}

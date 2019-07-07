package programmingSchool.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Solution {

    private int id;
    private Timestamp created;
    private Timestamp updated;
    private String description;
    private int exerciseId;
    private int userId;

    public Solution(Timestamp created, Timestamp updated, String description, int exerciseId, int userId) {
        this.created = created;
        this.updated = updated;
        this.description = description;
        this.exerciseId = exerciseId;
        this.userId = userId;
    }

    public Solution() {
    }
}

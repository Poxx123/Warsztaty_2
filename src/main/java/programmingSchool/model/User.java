package programmingSchool.model;

import lombok.Data;

@Data
public class User {

    private int id;
    private String username;
    private String email;
    private String password;
    private int groupId;

    public User(String username, String email, String password, int groupId) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.groupId = groupId;
    }

    public User() {

    }
}

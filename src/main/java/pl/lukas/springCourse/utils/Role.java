package pl.lukas.springCourse.utils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username; // userName for jdbc = USER_NAME
    private String role;

    public Role() {
    }

    public Role(String userName, String userRole) {
        this.username = userName;
        this.role = userRole;
    }
}

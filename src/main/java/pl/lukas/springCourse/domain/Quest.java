package pl.lukas.springCourse.domain;

import org.springframework.stereotype.Component;

@Component
public class Quest {

    private String description;

    public Quest() {
        this.description = "uratuj księżniczkę";
    }

    @Override
    public String toString() {
        return description;
    }
}

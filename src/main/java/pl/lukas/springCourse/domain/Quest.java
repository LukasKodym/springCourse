package pl.lukas.springCourse.domain;

public class Quest {

    private String description;

    public Quest() {
    }

    public Quest(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

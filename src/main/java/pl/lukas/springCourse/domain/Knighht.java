package pl.lukas.springCourse.domain;

public class Knighht {

    private String name;
    private int age;
    private Quest quest;

    public Knighht(String name, int age) {
        this.name = name;
        this.age = age;
        this.quest = new Quest("Uratuj księżniczkę");
    }

    @Override
    public String toString() {
        return "Ryzerz o imieniu " + name + " (" +  age + "). Zadanie: " + quest;
    }
}

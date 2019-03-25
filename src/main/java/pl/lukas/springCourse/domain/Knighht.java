package pl.lukas.springCourse.domain;

public class Knighht {

    private String name;
    private int age;
    private Quest quest;

    public Knighht(String name, int age, Quest quest) {
        this.name = name;
        this.age = age;
        this.quest = quest;
    }

    public Knighht(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    @Override
    public String toString() {
        return "Ryzerz o imieniu " + name + " (" +  age + "). Zadanie: " + quest + ".";
    }
}

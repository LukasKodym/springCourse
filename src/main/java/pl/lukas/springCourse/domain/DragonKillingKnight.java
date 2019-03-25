package pl.lukas.springCourse.domain;

public class DragonKillingKnight {

    private String name;
    private int age;
    private Quest quest;

    public DragonKillingKnight(String name, int age) {
        this.name = name;
        this.age = age;
        this.quest = new Quest("Zabij smoka");
    }

    @Override
    public String toString() {
        return "Ryzerz o imieniu " + name + " (" +  age + "). Zadanie: " + quest + ".";
    }
}
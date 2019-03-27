package pl.lukas.springCourse.domain;

public class Knight {

//    @Value("Lancelot") // this is the same as: private String name = "Lancelot";
    private String name;
//    @Value("29")
    private int age;
    private Quest quest;

    public Knight(){

    }

//    public Knight(String name, int age, Quest quest) {
//        this.name = name;
//        this.age = age;
//        this.quest = quest;
//    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setQuest(Quest quest) {
        System.out.println("Ustawiam zadanie dla rycerza");
        this.quest = quest;
    }

    @Override
    public String toString() {
//        return "Ryzerz o imieniu " + name + " (" +  age + ").";
        return "Ryzerz o imieniu " + name + " (" +  age + ") Ma za zadanie: " + quest + ".";
    }
}

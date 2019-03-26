package pl.lukas.springCourse.domain;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Knight {

    @Value("Lancelot")
    private String name;
    @Value("29")
    private int age;
//    private Quest quest;

    public Knight(){

    }

//    public Knight(String name, int age, Quest quest) {
//        this.name = name;
//        this.age = age;
//        this.quest = quest;
//    }

//    public Knight(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

//    public void setQuest(Quest quest) {
//        this.quest = quest;
//    }

    @Override
    public String toString() {
        return "Ryzerz o imieniu " + name + " (" +  age + /*"). Zadanie: " + quest +*/ ".";
    }
}

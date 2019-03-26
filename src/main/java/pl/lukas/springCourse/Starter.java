package pl.lukas.springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.lukas.springCourse.domain.Castle;
import pl.lukas.springCourse.domain.Knight;
import pl.lukas.springCourse.domain.Quest;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);

        Quest saveThePrincess = new Quest ("Uratuj księżniczkę");
        Knight lancelot = new Knight("Lancelot", 29, saveThePrincess);

        System.out.println(lancelot);

        Quest killTheDragon = new Quest("Zabij smoka");
        Knight percival = new Knight("Percival", 31);

        System.out.println(percival);

        percival.setQuest(killTheDragon);

        System.out.println(percival);
    }
}

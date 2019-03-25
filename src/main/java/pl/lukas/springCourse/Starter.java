package pl.lukas.springCourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.lukas.springCourse.domain.Knighht;
import pl.lukas.springCourse.domain.Quest;

@Component
public class Starter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Quest saveThePrincess = new Quest ("Uratuj księżniczkę");

        Knighht lancelot = new Knighht("Lancelot", 29, saveThePrincess);

        System.out.println(lancelot);

        Quest killTheDragon = new Quest("Zabij smoka");
        Knighht percival = new Knighht("Percival", 31, killTheDragon);

        System.out.println(percival);

    }
}

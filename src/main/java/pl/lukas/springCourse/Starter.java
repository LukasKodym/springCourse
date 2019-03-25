package pl.lukas.springCourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.lukas.springCourse.domain.Knighht;

@Component
public class Starter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Knighht lancelot = new Knighht("Lancelot", 29);

        System.out.println(lancelot);

    }
}

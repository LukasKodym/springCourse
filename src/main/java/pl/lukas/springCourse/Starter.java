package pl.lukas.springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.lukas.springCourse.domain.repository.KnightRepository;

@Component()
@Scope("singleton") // this setting is as a default, redundant to write this line
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepository knightRepository;


    @Override
    public void run(String... args) throws Exception {
        System.out.println(knightRepository);
    }
}

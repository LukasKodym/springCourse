package pl.lukas.springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.lukas.component.TestComponent;
import pl.lukas.springCourse.domain.Castle;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    TestComponent test;

    @Autowired
    Castle castle;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);

    }
}

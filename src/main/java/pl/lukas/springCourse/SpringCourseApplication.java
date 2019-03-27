package pl.lukas.springCourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pl.lukas.component.TestComponent;
import pl.lukas.springCourse.domain.Castle;
import pl.lukas.springCourse.domain.Knight;
import pl.lukas.springCourse.domain.Quest;

@SpringBootApplication
// @ComponentScan({"pl.lukas.springCourse", "pl.lukas.component"})
@ComponentScan(basePackageClasses = {Starter.class, Castle.class, Quest.class,
        Knight.class, TestComponent.class} ) // this works similar as example above
public class SpringCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCourseApplication.class, args);
    }
}

package pl.lukas.springCourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.lukas.springCourse.domain.Castle;

@SpringBootApplication
public class SpringCourseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringCourseApplication.class, args);
		Castle castle = (Castle) ctx.getBean("castle");
		System.out.println(castle);
	}
}

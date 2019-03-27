package pl.lukas.springCourse.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import pl.lukas.springCourse.domain.Castle;

@Configuration
@PropertySource("classpath:castle.properties")
@Import(MainConfig.class)
public class CastleConfig {

    @Bean(name = "castle", initMethod = "build", destroyMethod = "tearDown")
    @Value("${my.castle.name:East Watch}")
    public Castle castle(String name){
        Castle castle = new Castle(knight());
        castle.setName(name);
        return castle;
    }
}

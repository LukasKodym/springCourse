package pl.lukas.springCourse.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import pl.lukas.springCourse.domain.Castle;
import pl.lukas.springCourse.domain.Knight;
import pl.lukas.springCourse.domain.Quest;

@Configuration
//@ImportResource("classpath:config/castleConfig.xml")
//@PropertySource("classpath:castle.properties")
public class MainConfig {


//    @Bean
//    public Quest createQuest() {
//        return new Quest();
//    }
//
//    @Bean
//    public Knight knight() {
//        Knight knight = new Knight("Lancelot", 29);
//        knight.setQuest(createQuest());
//        return knight;
//    }
//
//    @Bean(name = "castle", initMethod = "build", destroyMethod = "tearDown")
//    @Value("${my.castle.name:East Watch}")
//    public Castle castle(String name){
//        Castle castle = new Castle(knight());
//        castle.setName(name);
//        return castle;
//    }
}

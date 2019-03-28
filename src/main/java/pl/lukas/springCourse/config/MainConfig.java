package pl.lukas.springCourse.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import pl.lukas.springCourse.domain.Knight;
import pl.lukas.springCourse.domain.Quest;


@Configuration
//@ImportResource("classpath:config/castleConfig.xml")
public class MainConfig {


    @Autowired
    Quest quest;

    @Bean(name = "lancelot")
//    @Primary
    public Knight lancelot() {
        Knight lancelot = new Knight("Lancelot", 29);
        lancelot.setQuest(quest);
        return lancelot;
    }

    @Bean(name = "percival")
    public Knight createKnightBean() {
        Knight percival = new Knight("Percival", 25);
        percival.setQuest(quest);
        return percival;
    }
}

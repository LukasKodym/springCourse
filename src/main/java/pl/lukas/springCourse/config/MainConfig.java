package pl.lukas.springCourse.config;

import org.springframework.context.annotation.*;
import pl.lukas.springCourse.domain.repository.DBKnightRepository;
import pl.lukas.springCourse.domain.repository.InMemoryRepository;
import pl.lukas.springCourse.domain.repository.KnightRepository;

@Configuration
public class MainConfig {

    @Bean(name = "inMemoryKnightRepository")
    @Profile("dev")
    public KnightRepository createInMemoryRepo(){
        KnightRepository repo = new InMemoryRepository();
        return repo;
    }

    @Bean(name = "DBKnightRepository")
    @Profile("prod")
    public KnightRepository createDBRepo(){
        KnightRepository repo = new DBKnightRepository();
        return repo;
    }
}

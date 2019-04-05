package pl.lukas.springCourse.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
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

    @Autowired
    public void securityUsers(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("user1")
                .password("user1")
                .roles("USER")
                .and()
                .withUser("user2")
                .password("user2")
                .roles("ADMIN");
    }
}

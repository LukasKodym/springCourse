package pl.lukas.springCourse.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Castle {

    private String name = "East Watch";

    @Autowired
    Knight knight;

    public Castle() {

    }
    @PostConstruct
    public void build (){
        System.out.println("Wybudowano zamek " + name);
    }

    @PreDestroy
    public void tearDown (){
        System.out.println("Zaraz wyburzymy zamek " + name);
    }

    @Override
    public String toString() {
        return "Znajduje się tu zamek o nazwie " + this.name + ". Zamieszkały przez rycerza " + knight;
    }
}

package pl.lukas.springCourse.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Castle {

    private String name;

    Knight knight;

    public Castle(Knight knight) {
        this.knight = knight;
    }


    Castle(String name, Knight knight) {
        this.name = name;
        this.knight = knight;
    }

    public void build() {
        System.out.println("Wybudowano zamek " + name);
    }

    public void tearDown() {
        System.out.println("Zaraz wyburzymy zamek " + name);
    }

    @Override
    public String toString() {
        return "Znajduje się tu zamek o nazwie " + this.name + ". Zamieszkały przez rycerza " + knight;
    }
}

package pl.lukas.springCourse.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Turnament {

    @Autowired
    Knight knight;

    public Turnament() {
    }

    public void duel() {
        knight.setAge(knight.getAge() + 1);
    }

    @Override
    public String toString() {
        return "W turnieju bierze udział rycerz: " + knight;
    }
}

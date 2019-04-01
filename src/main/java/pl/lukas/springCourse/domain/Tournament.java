package pl.lukas.springCourse.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class Tournament {

    @Autowired
    List<Knight> knights;
//    Map<String, Knight> knights; // this collection is used without @Autowired annotation

    public Tournament() {
    }

    public void duel() {
//        knight.setAge(knight.getAge() + 1);
    }

    public void setKnight(List<Knight> knights) {
        this.knights = knights;
    }

    @Override
    public String toString() {
        return "W turnieju biorą udział rycerze: "
                + knights.stream().map(Objects::toString).
                collect(Collectors.joining(" , "));
    }
}

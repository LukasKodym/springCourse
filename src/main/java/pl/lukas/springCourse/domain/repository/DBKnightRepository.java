package pl.lukas.springCourse.domain.repository;

import org.springframework.stereotype.Repository;
import pl.lukas.springCourse.domain.Knight;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import sun.text.normalizer.NormalizerImpl;

import javax.annotation.PostConstruct;
import java.util.Collection;

public class DBKnightRepository implements KnightRepository {

    @Override
    public void createKnight(String name, int age) {
        System.out.println("Używam bazy danych");
        throw new NotImplementedException();
    }

    @Override
    public Collection<Knight> getAllKnights() {
        System.out.println("Używam bazy danych");
        throw new NotImplementedException();
    }

    @Override
    public Knight getKnight(String name) {
        System.out.println("Używam bazy danych");
        throw new NotImplementedException();
    }

    @Override
    public void deleteKnight(String name) {
        System.out.println("Używam bazy danych");
        throw new NotImplementedException();
    }

    @Override
    @PostConstruct
    public void build() {
    }

}
package pl.lukas.springCourse.domain.repository;

import pl.lukas.springCourse.domain.Knight;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;
import java.util.Optional;

public interface KnightRepository {

    Knight getKnightById(Integer id);

    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Optional<Knight> getKnight(String name);

    void deleteKnight(Integer id);

    void build();

    void createKnight(Knight knight);

    default void updateKnight(int id, Knight knight) {
        throw new NotImplementedException();
    }
}

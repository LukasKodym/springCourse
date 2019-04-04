package pl.lukas.springCourse.domain.repository;

import pl.lukas.springCourse.domain.Knight;
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
}

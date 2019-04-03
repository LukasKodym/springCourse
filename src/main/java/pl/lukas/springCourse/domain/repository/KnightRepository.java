package pl.lukas.springCourse.domain.repository;

import pl.lukas.springCourse.domain.Knight;
import java.util.Collection;

public interface KnightRepository {
    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Knight getKnight(String name);

    void deleteKnight(String name);

    void build();

    void createKnight(Knight knight);
}

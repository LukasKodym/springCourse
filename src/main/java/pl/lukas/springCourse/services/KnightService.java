package pl.lukas.springCourse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.lukas.springCourse.domain.Knight;
import pl.lukas.springCourse.domain.repository.KnightRepository;
import java.util.ArrayList;
import java.util.List;

@Component
public class KnightService {

    @Autowired
    KnightRepository knightRepository;

    public List<Knight> getAllKnights() {
        return new ArrayList<>(knightRepository.getAllKnights());
    }
}
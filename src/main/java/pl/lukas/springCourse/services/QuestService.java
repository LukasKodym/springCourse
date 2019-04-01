package pl.lukas.springCourse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.lukas.springCourse.domain.Quest;
import pl.lukas.springCourse.domain.repository.KnightRepository;
import pl.lukas.springCourse.domain.repository.QuestRepository;

import java.util.List;
import java.util.Random;

@Component
public class QuestService {

    @Autowired
    KnightRepository knightRepository;
    @Autowired
    QuestRepository questRepository;

    final static Random random = new Random();

    public void assignRandomQuest(String knightName){
        List<Quest> allQuests = questRepository.getAll();
        Quest randomQuest = allQuests.get(random.nextInt(allQuests.size()));
        knightRepository.getAllKnights(knightName).setQuest(randomQuest);
    }

}

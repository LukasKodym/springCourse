package pl.lukas.springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.lukas.springCourse.domain.PlayerInformation;
import pl.lukas.springCourse.domain.repository.KnightRepository;
import pl.lukas.springCourse.domain.repository.PlayerInformationRepository;
import pl.lukas.springCourse.domain.repository.QuestRepository;
import pl.lukas.springCourse.services.QuestService;

@Component()
@Scope("singleton") // this setting is as a default, redundant to write this line
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;

    @Autowired
    PlayerInformationRepository playerInformationRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        playerInformationRepository.createPlayerInformation(new PlayerInformation());
        questRepository.createRandomQuest();
        questRepository.createRandomQuest();
        knightRepository.createKnight("Percival", 25);
        questService.assignRandomQuest("Percival");
    }
}
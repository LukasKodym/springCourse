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
import pl.lukas.springCourse.utils.Role;
import pl.lukas.springCourse.utils.RoleRepository;

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

    @Autowired
    RoleRepository roleRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        questRepository.createRandomQuest();
        questRepository.createRandomQuest();
        knightRepository.createKnight("Percival", 25);
        questService.assignRandomQuest("Percival");
//        playerInformationRepository.createPlayerInformation(new PlayerInformation());

        PlayerInformation playerInformation1 = new PlayerInformation("user1", "user1");
        playerInformationRepository.createPlayerInformation(playerInformation1);
        PlayerInformation playerInformation2 = new PlayerInformation("user2", "user2");
        playerInformationRepository.createPlayerInformation(playerInformation2);

        Role user1RoleUSER = new Role("user1", "USER");
        Role user2RoleUSER = new Role("user2", "USER");
        Role user2RoleADMIN = new Role("user2", "ADMIN");

        roleRepository.persistRole(user1RoleUSER);
        roleRepository.persistRole(user2RoleUSER);
        roleRepository.persistRole(user2RoleADMIN);
    }
}
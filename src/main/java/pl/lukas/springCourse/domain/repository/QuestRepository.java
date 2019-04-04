package pl.lukas.springCourse.domain.repository;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import pl.lukas.springCourse.domain.Quest;
import pl.lukas.springCourse.utils.Ids;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class QuestRepository {

    Map<Integer, Quest> quests = new HashMap<>();

    Random random = new Random();

    public void createQuest(String description) {
        int newId = Ids.generateNewId(quests.keySet());
        Quest newQuest = new Quest(newId, description);
        quests.put(newId, newQuest);
    }

    public List<Quest> getAll() {
        return new ArrayList<>(quests.values());
    }

    public void deleteQuest(Quest quest) {
        quests.remove(quest.getId());
    }

    @PostConstruct
    public void init() {
    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + quests +
                '}';
    }

    @Scheduled(fixedDelayString = "${questCreationDelay}")
    public void createRandomQuest() {
        List<String> descriptions = new ArrayList<>();
        descriptions.add("Uratuj księżniczkę");
        descriptions.add("Weź udział w turnieju");
        descriptions.add("Zabij bandę goblinów");
        descriptions.add("Zabij smoka");

        String description = descriptions.get(random.nextInt(descriptions.size()));
        createQuest(description);
    }

    public void update(Quest quest) {
        quests.put(quest.getId(),quest);
    }

    public Quest getQuest(Integer id) {
        return quests.get(id);
    }
}
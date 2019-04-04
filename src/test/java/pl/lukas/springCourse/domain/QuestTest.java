package pl.lukas.springCourse.domain;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class QuestTest {

    @Test
    public void settingStartedToFalseShouldSetStartDate(){
        Quest quest = new Quest(1,"Nowe zadanie");
        quest.setStarted(true);
        assertNotNull(quest.startDate);
    }

    @Test
    public void
}

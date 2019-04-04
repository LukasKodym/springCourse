package pl.lukas.springCourse.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestTest {

    @Test
    public void settingStartedToFalseShouldSetStartDate(){
        Quest quest = new Quest(1,"Nowe zadanie");
        quest.setStarted(true);
        assertNotNull(quest.startDate);
    }

    @Test
    public void testShouldBeCompleted(){
        Quest quest = new Quest(1,"Nowe zadanie");
        quest.setStarted(true);
        quest.lengthInSeconds = -60;
        assertTrue(quest.isCompleted());
        assertTrue(quest.isCompleted());
    }

    @Test
    public void testShouldNotBeCompleted(){
        Quest quest = new Quest(1,"Nowe zadanie");
        quest.setStarted(true);
        quest.lengthInSeconds = 20000;
        assertFalse(quest.isCompleted());
        assertFalse(quest.isCompleted());
    }
}

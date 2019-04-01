package pl.lukas.springCourse.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightRepositoryTest {

    @Test
    public void castleToStringMessage() {
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        KnightRepository knightRepository = new KnightRepository("Castle Black",knight);
        String expect = "Znajduje się tu zamek o nazwie Castle Black. Zamieszkały przez rycerza Ryzerz" +
                " o imieniu Lancelot (29) Ma za zadanie: uratuj księżniczkę.";
        assertEquals(expect, knightRepository.toString());
    }
}

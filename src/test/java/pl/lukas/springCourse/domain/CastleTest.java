package pl.lukas.springCourse.domain;

import org.junit.Test;
import pl.lukas.springCourse.domain.Castle;
import pl.lukas.springCourse.domain.Knight;
import static org.junit.Assert.assertEquals;

public class CastleTest {

    @Test
    public void castleToStringMessage() {
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        Castle castle  = new Castle("Castle Black",knight);
        String expect = "Znajduje się tu zamek o nazwie Castle Black. Zamieszkały przez rycerza Ryzerz" +
                " o imieniu Lancelot (29) Ma za zadanie: uratuj księżniczkę.";
        assertEquals(expect, castle.toString());
    }
}

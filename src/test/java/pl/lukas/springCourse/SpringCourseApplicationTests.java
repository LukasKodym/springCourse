package pl.lukas.springCourse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.lukas.springCourse.domain.Castle;
import pl.lukas.springCourse.domain.Knight;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCourseApplicationTests {

    @Autowired
    Knight knight;

    @Autowired
    Castle castle;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testCastle() {
        String expect = "Znajduje się tu zamek o nazwie Castle Black. Zamieszkały przez rycerza Ryzerz" +
                " o imieniu Lancelot (29) Ma za zadanie: uratuj księżniczkę.";
        assertEquals(expect, castle.toString());
    }
}

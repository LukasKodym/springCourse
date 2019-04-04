package pl.lukas.springCourse;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import pl.lukas.springCourse.controllers.QuestController;
import pl.lukas.springCourse.domain.Knight;
import pl.lukas.springCourse.domain.PlayerInformation;
import pl.lukas.springCourse.domain.Quest;
import pl.lukas.springCourse.services.KnightService;
import pl.lukas.springCourse.services.QuestService;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebAppConfiguration
public class WebContextTest {

    @Mock
    KnightService knightService;

    @Mock
    QuestService questService;

    @Mock
    PlayerInformation playerInformation;

    @InjectMocks
    QuestController questController;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(questController).build();
    }

    @Test
    public void testCheckQuest() throws Exception {

        Quest quest = new Quest(0, "Zadanie testowe");

        Knight percival = new Knight("Percival", 33);
        Knight percival2 = new Knight("Percival2", 34);

        percival.setQuest(quest);

        List<Knight> knights = new ArrayList<>(2);
        knights.add(percival);
        knights.add(percival2);

        when(knightService.getAllKnights()).thenReturn(knights);
        mockMvc.perform(get("/checkquests"))
                .andExpect(status().is3xxRedirection())
                .andExpect(view().name("redirect:/knights"));
                }

    @Test
    public void contextLoads() {
    }

}

package pl.lukas.springCourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.lukas.springCourse.domain.Knight;
import pl.lukas.springCourse.domain.Quest;
import pl.lukas.springCourse.services.KnightService;
import pl.lukas.springCourse.services.QuestService;

import java.util.List;

@Controller
public class QuestController {

    @Autowired
    KnightService knightService;

    @Autowired
    QuestService questService;

    @RequestMapping("/assignquest")
    public String assignQuest(@RequestParam("knightId") Integer id, Model model) {
        Knight knight = knightService.getKnight(id);
        List<Quest> notStartedQuests = questService.getAllNotStartedQuests();
        model.addAttribute("knight", knight);
        model.addAttribute("notstartetquests", notStartedQuests);
        return "assignquest";
    }

    @RequestMapping(value = "/assignquest", method = RequestMethod.POST)
    public String assignQuest(Knight knight, BindingResult result) {
        System.out.println(result);
        knightService.updateKnight(knight);
//        Quest quest = knight.getQuest();
//        questService.update(quest);
        return "redirect:/knights";
    }

    @RequestMapping(value = "/checkquest")
    public String checkQuest() {
        List<Knight> allKnights = knightService.getAllKnights();
        allKnights.forEach(knight -> {
            knight.getQuest().isCompleted();
        });
        knightService.collectReward();
        return "redirect:/knights";
    }
}


package pl.lukas.springCourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.lukas.springCourse.domain.Knight;
import pl.lukas.springCourse.services.KnightService;

import java.util.List;


@Controller
public class KnightController {

    @Autowired // in first step there was injected KnightRepository but better is to do via service
            KnightService service;

    @RequestMapping("/knights")
    public String getKnights(Model model) {
        List<Knight> allKnights = service.getAllKnights();
        model.addAttribute("knights", allKnights);
        return "knights";

    }

    @RequestMapping("/newknight")
    public String createKnight(Model model) {
        model.addAttribute("knight", new Knight());
        return "knightform";
    }

    @RequestMapping(value = "/knights", method = RequestMethod.POST)
    public String saveKnight(Knight knight) {
        service.saveKnight(knight);
        return "redirect:/knights";
    }
}

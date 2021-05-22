package person.biki.learnspring.sfgjokegen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import person.biki.learnspring.sfgjokegen.services.ChuckNorrisQuoteGenerator;

@Controller
public class JokesController {
    ChuckNorrisQuoteGenerator chuckNorrisQuoteGenerator;

    public JokesController(ChuckNorrisQuoteGenerator chuckNorrisQuoteGenerator) {
        this.chuckNorrisQuoteGenerator = chuckNorrisQuoteGenerator;
    }
    @RequestMapping({"/", ""})
    public String getQuote(Model model) {
        model.addAttribute("joke", chuckNorrisQuoteGenerator.getRandomQuote());
        return "index";
    }
}

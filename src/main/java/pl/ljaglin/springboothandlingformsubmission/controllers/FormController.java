package pl.ljaglin.springboothandlingformsubmission.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.ljaglin.springboothandlingformsubmission.models.FamousPerson;

@Controller
public class FormController {

    @GetMapping("/form")
    public String displayForm(Model model) {
        model.addAttribute("famousPerson", new FamousPerson());
        return "famousPersonForm";
    }

    @PostMapping("/form")
    public String formSubmit(@ModelAttribute FamousPerson famousPerson) {
        return "resultPage";
    }
}

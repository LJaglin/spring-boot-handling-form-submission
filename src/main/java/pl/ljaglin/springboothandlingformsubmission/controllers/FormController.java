package pl.ljaglin.springboothandlingformsubmission.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {

    @GetMapping("/form")
    @ResponseBody
    public String sayHello() {
        return "HELLO";
    }
}

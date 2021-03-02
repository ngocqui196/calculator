package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class CalController {
    private final String ADDITION = "+";
    private final String SUBTRACTION = "-";
    private final String MULTIPLICATION = "*";
    private final String DIVISION = "/";
    @GetMapping
    public String show() {
        return "index";
    }
    @PostMapping("/calculator")
    public String calculator(@RequestParam double input,
                             @RequestParam double input2, String calcul, Model model) {
        double result = 0;
        switch (calcul) {
            case ADDITION:
                result = input + input2;
                break;
            case SUBTRACTION:
                result = input - input2;
                break;
            case MULTIPLICATION:
                result = input * input2;
                break;
            case DIVISION:
                result = input / input2;
                break;
        }
        model.addAttribute("result",result);
        return "index";
    }
}
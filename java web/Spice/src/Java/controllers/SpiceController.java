package Java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class SpiceController {
    @PostMapping("display")
        public String SpiceSelect(Model model,
                           @RequestParam("condiment") String[] condiments) {
        if (condiments.length == 0) {
            model.addAttribute("condiment", "không chọn j cả");
        } else {
            model.addAttribute("condiment", condiments);
        }
        return "home";
        }
        @GetMapping("home")
        public String Sandwich () {
            return "home";
        }
    }

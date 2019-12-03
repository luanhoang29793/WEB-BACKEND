package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Convert {
    @GetMapping("/display")
    public String Display(){
        return "Display";
    }
    @GetMapping("/display1")
    public String Display1(){
        return "Display1";
    }
    @RequestMapping(value = "/convert", method = RequestMethod.POST)
    public String Convert(@RequestParam("input") double input, @RequestParam("rate") double rate, Model model){
        double result = input * rate;
        model.addAttribute("input", input);
        model.addAttribute("rate", rate);
        model.addAttribute("result", result);
        return "Display";
    }
    @RequestMapping(value = "/convert1", method = RequestMethod.POST)
    public String Convert(@RequestParam("input1") int input1, @RequestParam("rate1") int rate1, Model model){
        double result1 = input1 / rate1;
        model.addAttribute("input1", input1);
        model.addAttribute("rate1", rate1);
        model.addAttribute("result1", result1);
        return "Display1";
    }
}

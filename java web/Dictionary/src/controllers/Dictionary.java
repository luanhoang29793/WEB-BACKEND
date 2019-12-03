package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    @GetMapping("/Dictionary")
    public String Dictionary(){
        return "Dictionary";
    }
    @RequestMapping( value = "/translate", method = RequestMethod.POST)
    public String DictionaryEnglish(@RequestParam("text") String text, Model model){
        Map<String ,String> dic = new HashMap<>();
        dic.put("hello","Xin chào");
        dic.put("hot","Nóng");
        dic.put("cool","Lạnh");
        dic.put("pig","Lợn");
       if (dic.get(text) !=null){
           model.addAttribute("result", dic.get(text));
           model.addAttribute("text", text + "có nghĩa là");
           return "Dictionary";
       } else {
           model.addAttribute("result", "Not found");
           model.addAttribute("text", text );
           return "Dictionary";
       }

    }

}

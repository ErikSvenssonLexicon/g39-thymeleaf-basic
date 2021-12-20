package se.lexicon.g39thymeleafbasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHelloWorld(
            @RequestParam(value = "message", required = false) String message,
            Model backPack){
        String m = "This is from model";
        if(message != null){
            m = message;
        }
        backPack.addAttribute("message", m);
        return "hello_world";
    }

}

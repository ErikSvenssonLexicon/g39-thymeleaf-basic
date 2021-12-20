package se.lexicon.g39thymeleafbasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MessageBoardController {
    private List<String> messages = new ArrayList<>();

    @GetMapping("/board/messages")
    public String getMessages(Model model){
        model.addAttribute("messages", messages);
        return "message_page";
    }

    @PostMapping("/board/messages/add")
    public String addMessage(@RequestParam("message") String message, Model model){
        if(message != null && !message.isEmpty()){
            messages.add(message);
        }
        model.addAttribute("messages", messages);
        return "redirect:/board/messages";
    }

}

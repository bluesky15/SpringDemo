package com.lkb.springdemo.viewcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "LKB");
        model.addAttribute("mode", "production");
        //model.addAttribute("datetime", new Date());

        return"home";
    }

}

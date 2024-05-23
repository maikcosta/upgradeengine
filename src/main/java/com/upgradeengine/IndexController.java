package com.upgradeengine;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping("/")
    public ModelAndView index(Model model){
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("java", "1.1.0");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}


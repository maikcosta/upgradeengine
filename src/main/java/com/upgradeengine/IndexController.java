package com.upgradeengine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public ModelAndView index(Model model){
        String configUrl = "http://localhost:8080/config";
        Map<String, String> config = restTemplate.getForObject(configUrl, Map.class);

        model.addAttribute("java", config.get("javaVersion"));
        model.addAttribute("spring", config.get("springVersion"));
        model.addAttribute("parent", config.get("parentVersion"));

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}



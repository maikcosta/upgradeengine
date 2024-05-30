package com.upgradeengine;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${java.version}")
    private String javaVersion;

    @Value("${spring.version}")
    private String springVersion;

    @Value("${parent.version}")
    private String parentVersion;

    @GetMapping
    public Map<String, String> getConfig() {
        Map<String, String> config = new HashMap<>();
        config.put("javaVersion", javaVersion);
        config.put("springVersion", springVersion);
        config.put("parentVersion", parentVersion);
        return config;
    }
}





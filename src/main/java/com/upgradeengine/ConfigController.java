package com.upgradeengine;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String getConfig() {
        StringBuilder config = new StringBuilder();

        config.append("Versão do Java: <b>").append(javaVersion).append("</b><br>");
        config.append("Versão do Spring Framework: <b>").append(springVersion).append("</b><br>");
        config.append("Versão do Parent: <b>").append(parentVersion).append("</b><br>");

        return config.toString();
    }
}




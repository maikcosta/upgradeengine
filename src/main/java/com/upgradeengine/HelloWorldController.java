package com.upgradeengine;

import org.springframework.core.SpringVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }
    @RequestMapping("/config")
    public String config(){
        String config;
        // Obtém a versão do Java
        String javaVersion = System.getProperty("java.version");
        config = "Versão do Java: <b>" + javaVersion + "</b><br>";
        // Obtém a versão do Spring Framework
        String springVersion = SpringVersion.getVersion();
        config += "Versão do Spring Framework: <b>" + springVersion + "<b><br>";

        return config ;
    }
}

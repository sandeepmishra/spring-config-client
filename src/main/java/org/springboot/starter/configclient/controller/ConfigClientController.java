package org.springboot.starter.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config/client")
public class ConfigClientController {

    @Value("${greeting}")
    private String greeting;

    @RequestMapping("/greeting")
    public String printConfigFile(){
        return greeting;
    }
}

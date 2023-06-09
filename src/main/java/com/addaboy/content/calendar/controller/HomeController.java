package com.addaboy.content.calendar.controller;

import com.addaboy.content.calendar.config.ContentCalendarProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @Value("${cc.welcomeMessage: <center><h1>Hello Audience</h1></center>}")
    private String welcomeMessage;

    @Value("${cc.about}")
    private String about;

    private final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of("welcomeMessage", welcomeMessage, "about", about);
    }

    @GetMapping("/prop")
    public ContentCalendarProperties homeProp() {
        return properties;
    }
}

package com.fyfe.graham.wifitracker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HelloWorldController {

    private static final Logger LOGGER = Logger.getLogger("HelloWorldController");

    @GetMapping("/helloWorld")
    public String helloWorld() {
        LOGGER.info("Hello World");
        return "Hello World";
    }
}

package org.proy.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GretingController {
    @GetMapping
    public String getGreeting(){
        return "Helloo world from spring boot";
    }
}

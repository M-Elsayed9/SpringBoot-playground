package com.playground.springboot.myApp.rest;

import com.playground.springboot.myApp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency coach
    private Coach coach;

    // define a constructor for dependency injection
    @Autowired
    public DemoController(Coach theCoach){
        coach = theCoach;
    }

    // define endpoint for "/workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}

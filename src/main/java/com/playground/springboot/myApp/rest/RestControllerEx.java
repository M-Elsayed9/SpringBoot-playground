package com.playground.springboot.myApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestControllerEx {

    //inject properties for leader and team names

    @Value("${leader.name}")
    private String leaderName;
    @Value("${team.name}")
    private String teamName;

    //expose "/" that returns "Hello World"
    @GetMapping("/")    //this is a mapping to the root of the application
    public String sayHello(){
        return "Hello World";
    }

    // expose a new endpoint for "team info"
    @GetMapping("/teamInfo")
    public String getTeamInfo(){
        return "Coach: " + leaderName + ", Team name: " + teamName;
    }
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day!";
    }
}

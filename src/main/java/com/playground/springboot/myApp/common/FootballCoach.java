package com.playground.springboot.myApp.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Run 5k";
    }
}

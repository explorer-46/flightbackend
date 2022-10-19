package com.nestdigital.flightBackend.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    @PostMapping("/addflight")
    public String addFlight(){
        return "test";
    }
}

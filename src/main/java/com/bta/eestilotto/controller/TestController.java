package com.bta.eestilotto.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
    @RequestMapping (path="/HW", method = RequestMethod.GET)
    public ResponseEntity<String> getHelloWorld(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}

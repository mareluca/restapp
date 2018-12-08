package com.project.restapp.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApiController {

    @GetMapping(value = "test")
    public ResponseEntity<Object> getTest(){
            return new ResponseEntity<>("TEST WORKING",HttpStatus.OK);
    }
}

package com.project.restapp.api;

import com.project.restapp.facade.FacadePerson;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Date;

@Controller
@Slf4j
public class ApiController {

    private final FacadePerson facadePerson;

    @Autowired
    ApiController(final FacadePerson facadePerson) {

        this.facadePerson = facadePerson;
    }

    @GetMapping(value = "/persons")
    public ResponseEntity<Object> getPersons() {

        log.info("Get all persons - controller at " + new Date().toString());

        return new ResponseEntity<>(facadePerson.getPersons(), HttpStatus.OK);
    }

}

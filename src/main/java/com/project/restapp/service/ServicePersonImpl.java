package com.project.restapp.service;

import com.project.restapp.model.PersonDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicePersonImpl implements ServicePerson {

    @Override
    public List<PersonDto> getPersons() {
        List<PersonDto> personDtos = new ArrayList<>();
        personDtos.add(new PersonDto("Marko", "Lucic"));
        personDtos.add(new PersonDto("Sara", "Petrovic"));
        return personDtos;
    }
}

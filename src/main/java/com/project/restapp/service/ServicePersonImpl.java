package com.project.restapp.service;

import com.project.restapp.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicePersonImpl implements ServicePerson {

    private List<Person> persons = new ArrayList<>();

    @Override
    public List<Person> getPersons() {

        this.persons.add(new Person("Sara", "Petrovic"));
        this.persons.add(new Person("Sara", "Petrovic"));
        return this.persons;
    }
}

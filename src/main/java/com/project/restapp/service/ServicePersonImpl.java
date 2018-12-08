package com.project.restapp.service;

import com.project.restapp.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePersonImpl implements ServicePerson{
    
    @Override
    public List<Person> getPersons() {
        return null;
    }
}

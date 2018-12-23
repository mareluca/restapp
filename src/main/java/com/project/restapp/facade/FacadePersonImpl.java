package com.project.restapp.facade;

import com.project.restapp.model.PersonDto;
import com.project.restapp.service.ServicePerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacadePersonImpl implements FacadePerson{

    private final ServicePerson servicePerson;

    @Autowired
    FacadePersonImpl(final ServicePerson servicePerson) {
        this.servicePerson = servicePerson;
    }

    @Override
    public List<PersonDto> getPersons() {

        return servicePerson.getPersons();
    }
}

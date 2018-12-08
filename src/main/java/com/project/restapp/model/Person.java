package com.project.restapp.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class Person {

    private String name;
    private String lastName;
    private List<Key> keys;
}

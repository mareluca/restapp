package com.project.restapp.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Key {
    private String id;
    private String description;
}

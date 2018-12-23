package com.project.restapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class PersonDto {

    private String name;

    @JsonProperty("last_name")
    private String lastName;

}

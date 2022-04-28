package com.ces.model;

import lombok.Data;

@Data
public class StudentResponse {
    private String firstName;
    private String lastName;
    private String token;

    public StudentResponse(){
        super();
    }
}

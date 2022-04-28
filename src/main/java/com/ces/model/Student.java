package com.ces.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue
    private Long studentId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String nationality;
    private String gender;
    //Audit Fields

    public Student(){
        super();
    }
}

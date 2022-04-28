package com.ces.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue
    @Column( nullable = false)
    private Long studentId;
    @Column( nullable = false)
    private String firstName;
    @Column( nullable = false)
    private String lastName;
    @Column( nullable = false)
    private String phoneNumber;
    @Column( nullable = false)
    private String nationality;
    @Column( nullable = false)
    private String gender;
    //Audit Fields

    public Student(){
        super();
    }
}

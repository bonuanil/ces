package com.ces.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "IDENTITY")
@Data
public class Identity {

    @Id
    @GeneratedValue
    private Long id;

    private String token;
    private String role;
    private Long studentId;

    public Identity(){
        super();
    }


}

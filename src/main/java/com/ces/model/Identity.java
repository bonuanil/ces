package com.ces.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "IDENTITY",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "token")
        })
@Data
public class Identity {

    @Id
    @GeneratedValue
    private Long id;

    @Column( nullable = false)
    private String token;
    @Column( nullable = false)
    private String role;
    private Long studentId;

    public Identity(){
        super();
    }


}

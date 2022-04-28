package com.ces.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="SEMESTER",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "semesterName"),
                @UniqueConstraint(columnNames = "year")
        })
@Data
public class Semester {
    @Id
    @GeneratedValue
    private Long semesterId;

    @Column( nullable = false)
    private SemesterName semesterName;

    @Column( nullable = false)
    private Long year;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "SEMESTER_CLASS",
            joinColumns = @JoinColumn(name = "semester_id"),
            inverseJoinColumns = @JoinColumn(name = "class_id"))
    private Set<AcademicClass> classes = new HashSet<>();

    public  Semester(){
        super();
    }
}


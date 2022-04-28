package com.ces.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="ACADEMIC_CLASS",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "title")
        })
@Data
public class AcademicClass {
    @Id
    @GeneratedValue
    @Column( nullable = false)
    private Long classId;

    @Column( nullable = false)
    private String title;

    @Column( nullable = false)
    private Long credits;

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }


}

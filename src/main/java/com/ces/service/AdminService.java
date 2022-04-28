package com.ces.service;

import com.ces.model.*;

import java.util.List;

public interface AdminService {

    public String registerStudent(Student student);

    public String updateStudent(Long StudentId, Student student);

    public List<Identity> getAllIdentities();

    public Long addAcademicClass(AcademicClass academicClass);

    public Long addSemester(Semester semester);


}

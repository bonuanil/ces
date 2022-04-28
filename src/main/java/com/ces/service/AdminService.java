package com.ces.service;

import com.ces.model.Identity;
import com.ces.model.Student;
import com.ces.model.StudentResponse;

import java.util.List;

public interface AdminService {

    public String registerStudent(Student student);

    public List<Identity> getAllIdentities();


}

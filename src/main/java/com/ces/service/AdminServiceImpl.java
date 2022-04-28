package com.ces.service;

import com.ces.model.Identity;
import com.ces.model.Student;
import com.ces.repository.IdentityRepository;
import com.ces.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private IdentityRepository identityRepository;

    @Override
    public String registerStudent(Student s) {
        Student student = studentRepository.save(s);
        return s.getFirstName();
    }

    @Override
    public List<Identity> getAllIdentities() {
        List<Identity> identities = new ArrayList<Identity>();
        identityRepository.findAll().forEach(identity -> identities.add(identity));
        return identities;
    }
}

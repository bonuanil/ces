package com.ces.service;

import com.ces.model.AcademicClass;
import com.ces.model.Identity;
import com.ces.model.Semester;
import com.ces.model.Student;
import com.ces.repository.AcademicClassRepository;
import com.ces.repository.IdentityRepository;
import com.ces.repository.SemesterRepository;
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

    @Autowired
    private AcademicClassRepository academicClassRepository;

    @Autowired
    private SemesterRepository semesterRepository;

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

    @Override
    public Long addAcademicClass(AcademicClass academicClass) {
        AcademicClass academicClass1 = academicClassRepository.save(academicClass);
        return academicClass1.getClassId();
    }

    @Override
    public Long addSemester(Semester semester) {
        Semester semester1 = semesterRepository.save(semester);
        return semester.getSemesterId();
    }

    @Override
    public String updateStudent(Long studentId, Student s) {
        Student student = studentRepository.save(s);
        return s.getFirstName();
    }


}

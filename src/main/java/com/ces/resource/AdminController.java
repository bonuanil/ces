package com.ces.resource;

import com.ces.model.*;
import com.ces.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/student")
    public ResponseEntity<String> registerStudent(@RequestBody Student student) {
        return new ResponseEntity<String>(adminService.registerStudent(student), HttpStatus.CREATED);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable Long studentId, @RequestBody Student student) {
        return new ResponseEntity<String>(adminService.updateStudent(studentId, student), HttpStatus.CREATED);
    }

    @PostMapping("/semester")
    public ResponseEntity<Long> addSemester(@RequestBody Semester semester) {
        return new ResponseEntity<Long>(adminService.addSemester(semester), HttpStatus.CREATED);
    }

    @PostMapping("/class")
    public ResponseEntity<Long> addClass(@RequestBody AcademicClass academicClass) {
        return new ResponseEntity<Long>(adminService.addAcademicClass(academicClass), HttpStatus.CREATED);
    }

    @PostMapping("/semester/{semId}/class/{classId}")
    public ResponseEntity<Long> addClass(@PathVariable Long semId, @PathVariable Long classId) {
        return new ResponseEntity<Long>(0L, HttpStatus.CREATED);
    }

    @GetMapping("/identities")
    public ResponseEntity<List<Identity>> getIdentities(){
        return new ResponseEntity<List<Identity>>(adminService.getAllIdentities(), HttpStatus.CREATED);
    }

}

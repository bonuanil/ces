package com.ces.resource;

import com.ces.model.Identity;
import com.ces.model.Student;
import com.ces.model.StudentResponse;
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


    @PostMapping
    public ResponseEntity<String> registerRunner(@RequestBody Student student) {

        return new ResponseEntity<String>(adminService.registerStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/identities")
    public ResponseEntity<List<Identity>> getAllIdentities(){
        return new ResponseEntity<List<Identity>>(adminService.getAllIdentities(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<String> welcome(){
        return new ResponseEntity<String>("Welcome to Class Enrollment System", HttpStatus.OK);
    }



}

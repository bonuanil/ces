# Title

Class Enrollment System

## Description

Develop a basic Class Enrollment System for Institutions & Students

## Getting Started

### Assumptions
1. Administrators are pre loaded on startup.
2. In-memory DB is volatile and results in data loss after restart.
3. Field validations are ignored
4. 

### Dependencies
1. Java
2. Spring Boot
3. H2 Database
4. Lombok

### DB Access
After starting the application, we can navigate to http://localhost:8080/h2, which will present us with a login page.

On the login page, we'll supply the same credentials that we used in the application.properties

### API Details

| Actor   | Methods | Endpoint                                       | Details                                                  |
|---------|---------|------------------------------------------------|----------------------------------------------------------|
| ADMIN   | PUT     | /student                                       | Add a student                                            |
| ADMIN   | POST    | /student/{id}                                  | Edit Student Information                                 |
| ADMIN   | PUT     | /semester                                      | Add Semester                                             |  
| ADMIN   | PUT     | /class                                         | Add Class                                                |
| ADMIN   | PUT     | /semester/{sem_id}/class/{class_id}/register   | Register a class in Semester                             | 
| ADMIN   | GET     | /semester/{id}/part                            | Lists all the partime students enrolled for the semester |
| STUDENT | PUT     | /student/semester/{id}/class/{class_id}/enroll | Enroll student to class and Semester                     |
| STUDENT | DELETE  | /student/semester/{id}/class/{class_id}/enroll | Delist student from class and semester                   | 
| BOTH    | GET     | /student/{id}                                  | Full History of classed enrolled by student              |
| BOTH    | GET     | /student/{id}/semester/{sem_id}                | List of classed enrolled by a student in a Semester      |
| BOTH    | GET     | /semester/{sem_id}/class/{class_id}            | List of Students enrolled for a class in semester        |


### Installation & Testing

    1. Clone the project
    2. Build executable Jar
    3. Run the executable jar
    4. Access the endpoints 'http://localhost:8080/ces/<resource URI>"

## Authors
1. Anil Kumar Bonu
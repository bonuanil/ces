package com.ces.repository;

import com.ces.model.Semester;
import com.ces.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepository extends CrudRepository<Semester, Long> {

}

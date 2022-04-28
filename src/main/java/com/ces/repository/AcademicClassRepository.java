package com.ces.repository;

import com.ces.model.AcademicClass;
import com.ces.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicClassRepository extends CrudRepository<AcademicClass, Long> {
}

package com.springboot.app.example1.models.repositories;


import com.springboot.app.example1.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}

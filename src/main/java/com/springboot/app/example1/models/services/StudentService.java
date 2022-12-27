package com.springboot.app.example1.models.services;


import java.util.List;
import com.springboot.app.example1.models.Student;

public interface StudentService {

    List<?> findAll();

    Student findById(String id);

    Student save(Student student);

    Student update(Student student);

    void delete(String id);
}

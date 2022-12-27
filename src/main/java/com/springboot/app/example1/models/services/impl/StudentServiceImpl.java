package com.springboot.app.example1.models.services.impl;

import com.springboot.app.example1.models.Student;
import com.springboot.app.example1.models.repositories.StudentRepository;
import com.springboot.app.example1.models.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Student findById(String id) {
        return repository.findById(id).orElse(new Student());
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public Student update(Student student) {
        return repository.save(student);
    }

    @Override
    public void delete(String id) {
       repository.findById(id).ifPresent(superHero -> repository.delete(superHero));
    }
}

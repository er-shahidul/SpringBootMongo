package com.springboot.app.example1.models.services.impl;


import java.util.List;
import org.springframework.stereotype.Service;
import com.springboot.app.example1.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.app.example1.models.services.StudentService;
import com.springboot.app.example1.models.repositories.StudentRepository;

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

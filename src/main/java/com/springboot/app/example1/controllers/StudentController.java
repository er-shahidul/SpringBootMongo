package com.springboot.app.example1.controllers;


import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springboot.app.example1.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.app.example1.models.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<?>> findAll() {
        List<?> list = studentService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        Student student = studentService.findById(id);
        return ResponseEntity.ok().body(student);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Student student) {
        Student savedStudent = studentService.save(student);
        return ResponseEntity.ok().body(savedStudent);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Student student) {
        Student updatedStudent = studentService.update(student);
        return ResponseEntity.ok().body(updatedStudent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        studentService.delete(id);
        return ResponseEntity.ok().body("Deleted successfully...!");
    }
}

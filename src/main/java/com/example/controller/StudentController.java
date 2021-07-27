package com.example.controller;

import com.example.model.Student;
import com.example.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    // http://localhost:5000/student/getStudent
    @GetMapping("/getStudent")
    public List<Student> getStudents() {
        return studentService.getAllStudent();
    }


    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
}

package com.example.service;

import com.example.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student> studentList = new ArrayList<>();

    public List<Student> getAllStudent() {
        return studentList;
    }

    public Student addStudent(Student student) {
        studentList.add(student);
        return student;
    }
}

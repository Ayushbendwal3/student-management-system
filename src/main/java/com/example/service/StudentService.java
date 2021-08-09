package com.example.service;

import com.example.exception.StudentNotFoundException;
import com.example.model.Student;
import com.example.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> {
            throw new StudentNotFoundException("Student not found");
        });
    }

    public Student updateStudent(Student student) {
        Student newStudent = getStudentById(student.getId());

        log.info(newStudent.getName());
        log.info(newStudent.getId().toString());
        log.info(newStudent.getStandard());

        if (student.getName() != null) {
            newStudent.setName(student.getName());
        }
        if (student.getStandard() != null) {
            newStudent.setStandard(student.getStandard());
        }

        return studentRepository.save(newStudent);
    }
}

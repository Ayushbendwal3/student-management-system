package com.example.exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message, Exception e) {
        super(message,e);
    }

    public StudentNotFoundException(String message) {
        super(message);
    }
}

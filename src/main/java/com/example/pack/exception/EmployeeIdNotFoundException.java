package com.example.pack.exception;

public class EmployeeIdNotFoundException extends RuntimeException {

    public EmployeeIdNotFoundException(String message) {
        super(message);
    }
}

package com.springboot.demo.exception;

public class EmployeeNotFoundException extends Exception{
    public EmployeeNotFoundException(String message){
        super(message);

    }
}

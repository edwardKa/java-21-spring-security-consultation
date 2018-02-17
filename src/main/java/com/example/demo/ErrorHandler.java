package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(value = {RuntimeException.class, IllegalArgumentException.class})
    public ResponseEntity<String> resolveError(RuntimeException e) {
        System.out.println();
        return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
    }

}

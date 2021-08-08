package com.example.queuegateway.configs;

import com.example.queuegateway.exception.ValidCustomException;
import com.example.queuegateway.response.ExceptionResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {
    @ExceptionHandler(value = ValidCustomException.class)
    public ExceptionResponse mismatchException(ValidCustomException exception) {
        return ExceptionResponse.builder().code(exception.getCode()).error(exception.getMessage()).build();
    }
}

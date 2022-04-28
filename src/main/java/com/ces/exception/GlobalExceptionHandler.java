package com.ces.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EnrollmentException.class)
    public ResponseEntity<ErrorResponse> handleException(EnrollmentException enrollmentException) {

        String code = enrollmentException.getCode();
        ErrorResponse errorResponse = ErrorResponse.buildErrorResponse(enrollmentException.getId(), code, enrollmentException.getMessage());
        switch (code) {

            case  "404" :
                return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);

            case "400" :
                return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);

            default :
                errorResponse.setCode("500");
                errorResponse.setMessage("Internal Server Error");
                return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }

}


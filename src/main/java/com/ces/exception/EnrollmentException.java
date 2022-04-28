package com.ces.exception;

import lombok.Data;

@Data
public class EnrollmentException extends Exception {

    private static final long serialVersionUID = -6930542248556723784L;

    private String id;
    private String code;
    private String message;

    public EnrollmentException() {
        super();
    }

    public EnrollmentException(String id, String code, String message){
        super(message);
        this.id = id;
        this.code = code;
        this.message = message;

    }

}

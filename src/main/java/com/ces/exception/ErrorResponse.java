package com.ces.exception;

import lombok.Data;

@Data
public class ErrorResponse {

    private String id;
    private String code;
    private String message;

    public ErrorResponse(String id, String code, String message) {
        this.id = id;
        this.code=code;
        this.message=message;
    }

    public static ErrorResponse buildErrorResponse(String id, String code, String message) {
        return new ErrorResponse(id, code, message);
    }


}

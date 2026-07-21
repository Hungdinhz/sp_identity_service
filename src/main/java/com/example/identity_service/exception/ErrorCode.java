package com.example.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIES_EXCEPTION(9999, "Uncategoried error"),
    INVALID_KEY(1000, "Invalid message key"),
    USER_EXISTED(1002, "User existed"),
    USERNAME_INVALID(1003, "Username must be 5 character"),
    INVALID_PASSWORD(1004, "Password must be 8 character!")
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}

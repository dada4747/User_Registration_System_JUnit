package com.bridgelabz;

public class UserResistrationException extends Exception {
    static String message;
    enum ExceptionType{
        ENTERED_NULL, ENTERED_INVALID
    }
    ExceptionType type;
    public UserResistrationException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }

}

package com.teachmeskills.lesson_10.task1;

public class StartDocumentNumberException extends Exception{
    public String documentNumber;
    public StartDocumentNumberException(String message) {
        super(message);
    }
}


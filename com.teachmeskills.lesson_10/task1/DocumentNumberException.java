package com.teachmeskills.lesson_10.task1;

public class DocumentNumberException extends Exception {
    public String documentNumber;
    public DocumentNumberException(String message) {
        super(message);
    }
}


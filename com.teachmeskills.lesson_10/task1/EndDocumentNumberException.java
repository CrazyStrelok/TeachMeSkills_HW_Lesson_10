package com.teachmeskills.lesson_10.task1;

public class EndDocumentNumberException extends Exception {
    public String documentNumber;
    public EndDocumentNumberException(String message) {
        super(message);
    }
}

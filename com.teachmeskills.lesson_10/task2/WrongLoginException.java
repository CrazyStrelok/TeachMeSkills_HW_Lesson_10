package com.teachmeskills.lesson_10.task2;

public class WrongLoginException extends Exception {
    public String login;

    public WrongLoginException() {

    }
    public WrongLoginException(String login) {
        this.login = login;
    }
    public boolean WrongLoginException (String message) {
        return false;
    }
}

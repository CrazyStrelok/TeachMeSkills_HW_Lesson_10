package com.teachmeskills.lesson_10.task2;

import com.teachmeskills.lesson_10.task2.Metod;
import com.teachmeskills.lesson_10.task2.WrongLoginException;

public class Runner1 extends Metod {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login = "sadsadasdas";
        String password = "2131321312123213213312312312";
        String confirmPassword = "dfafsf3424234";
        System.out.println(rightlogin(login));
        System.out.println(rightpassword(password));
    }
}

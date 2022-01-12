package com.teachmeskills.lesson_10.task2;

import com.teachmeskills.lesson_10.task2.WrongPasswordException;

public class Metod {
    String login;
    String pasword;
    static String confirmPassword;

    public static boolean rightlogin(String login) throws WrongLoginException {
        if (login.length() < 20 && !login.contains(" ")) {
            return true;
        } else if (login.length() > 20 && login.contains(" ")){
            throw new WrongLoginException();
        }
        return false;
    }

    public static boolean rightpassword(String pasword) throws WrongPasswordException {
        if (pasword.length() < 20 && !pasword.contains(" ") && pasword.matches("^[0-9]^") && pasword.equals(confirmPassword)){
            return true;
        } else if(pasword.length() < 20 && !pasword.contains(" ") && pasword.matches("^[0-9]^") && !pasword.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        return false;
    }
}


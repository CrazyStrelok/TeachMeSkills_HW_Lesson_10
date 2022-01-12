package com.teachmeskills.lesson_10.task1;

import com.teachmeskills.lesson_10.task1.DocumentNumberException;
import com.teachmeskills.lesson_10.task1.EndDocumentNumberException;
import com.teachmeskills.lesson_10.task1.StartDocumentNumberException;

import java.util.Locale;

public class DocumentNumber {

    String documentNumber;

    public static String replace(String documentNumber) {
        String[] array = documentNumber.split("-");
        for (int i = 0; i < array.length; i++) {
        }
        return array[0] + array[2];
    }

    public static String blocsReplace(String documentNumber) {
        String[] array = documentNumber.split("-");
        String str = documentNumber.replace(array[1], "  ");
        String str1 = str.replace(array[3], "  ");
        return str1;
    }

    public static String blocsToLowerCase(String documentNumber) {
        String rrr = documentNumber.replaceAll("[^a-zA-Z ]", "");
        StringBuffer sb = new StringBuffer(rrr);
        sb.insert(3, "/");
        sb.insert(7, "/");
        sb.insert(9, "/");
        String aaa = String.valueOf(sb);
        return aaa.toLowerCase(Locale.ROOT);
    }

    public static StringBuilder blocsToUpperCase(String documentNumber) {
        String rrr = documentNumber.replaceAll("[^a-zA-Z ]", "");
        StringBuilder sb = new StringBuilder(rrr);
        sb.insert(3, "/");
        sb.insert(7, "/");
        sb.insert(9, "/");
        String eee = "letters:" + String.valueOf(sb);
        return new StringBuilder(eee.toUpperCase());
    }

    public static void containsDocumentNumber(String documentNumber) throws DocumentNumberException {
        if (documentNumber.contains("abc")) {
            System.out.println(documentNumber);
        } else {
            throw new DocumentNumberException("DocumentNumber is not contains abc");
        }
    }

    public static void startDocumentNumber(String documentNumber) throws StartDocumentNumberException {
        if (documentNumber.startsWith("555")) {
            System.out.println(documentNumber);
        }else {
        throw new StartDocumentNumberException("DocumentNumber is not start 555");
    }
}
    public static void endDocumentNumber(String documentNumber) throws EndDocumentNumberException {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println(documentNumber);;
        } else {
            throw new EndDocumentNumberException("Documentnumber is not end 1a2b") ;
        }
    }
}


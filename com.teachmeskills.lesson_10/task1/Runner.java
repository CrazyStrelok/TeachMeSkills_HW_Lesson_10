package com.teachmeskills.lesson_10.task1;

import com.teachmeskills.lesson_10.task1.DocumentNumberException;
import com.teachmeskills.lesson_10.task1.EndDocumentNumberException;
import com.teachmeskills.lesson_10.task1.StartDocumentNumberException;

import static com.teachmeskills.lesson_10.task1.DocumentNumber.*;

public class Runner extends com.teachmeskills.lesson_10.task1.DocumentNumber {
        public static void main(String[] args) throws DocumentNumberException {
                String documentNumber = "3232-sss-3443-gfg-1j1k";

                System.out.println(replace(documentNumber));
                System.out.println(blocsReplace(documentNumber));
                System.out.println(blocsToLowerCase(documentNumber));
                System.out.println(blocsToUpperCase(documentNumber));
                try {
                        containsDocumentNumber(documentNumber);
                }
                catch (DocumentNumberException e){
                        System.out.println("Try again");
                }
                try{
                        startDocumentNumber(documentNumber);
                } catch (StartDocumentNumberException e) {
                        System.out.println("Try again");
                }
                try{
                        endDocumentNumber(documentNumber);
                }
                catch (EndDocumentNumberException e){
                        System.out.println("Try again");
                }
        }
}
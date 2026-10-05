package com.chiira;

import com.chiira.email.EmailValidator;

public class Main {
    public static void main(String[] args) {
        boolean isEmail = EmailValidator.emailValidator("kamania@com");

        System.out.println(isEmail);
    }
}

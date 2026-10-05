package com.chiira.email;

public class EmailValidator {
    public static boolean emailValidator(String email){
        if (!email.contains("@")){
            return false;
        }

        return true;
    }
}

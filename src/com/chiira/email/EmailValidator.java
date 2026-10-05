package com.chiira.email;

public class EmailValidator {
    public static boolean emailValidator(String email){
        if (email == null || email.isEmpty() || !email.contains("@")){
            return false;
        }

        return true;
    }
}

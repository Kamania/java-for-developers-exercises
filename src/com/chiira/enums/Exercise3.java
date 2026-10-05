package com.chiira.enums;

public class Exercise3 {
    public static void main(String[] args) {
        for (TShirtSize size: TShirtSize.values()){
            System.out.println("Lowercased T Shirt Size: " + size.toString().toLowerCase());
        }
    }
}

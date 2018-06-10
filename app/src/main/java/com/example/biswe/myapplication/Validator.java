package com.example.biswe.myapplication;
//Returns whether string follows a set of rules
//@param pass the string to check
//@return a boolean representing whether it passed the rules

public class Validator {
    public boolean validate(String pass){

        boolean passLength = pass.length() >= 8;
        boolean passNotPassword = !pass.equals("password");
        boolean passUpAndLow = !pass.equals(pass.toLowerCase())  && !pass.equals(pass.toUpperCase());
        boolean passHasSpecials = pass.matches(".*[!@#$%^&*].*");
        boolean passHasDigits = pass.matches(".*[0-9].*");

        if(passLength && passNotPassword && passUpAndLow && passHasSpecials && passHasDigits){
            return true;
        } else {
            return false;
        }
    }
}

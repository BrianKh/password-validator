package com.example.biswe.myapplication;
//Returns whether string follows a set of rules
//@param pass the string to check
//@return a boolean representing whether it passed the rules

public class Validator {
    public boolean validate(String pass){
        if(pass.length()>= 8 && !pass.equals("password") ){
            return true;
        }
        return false;
    }
}

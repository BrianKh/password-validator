package com.example.biswe.myapplication;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateUnitTest {
    static Validator validator;

    @BeforeClass
    public static void createClass(){
        validator = new Validator();
    }

    @Test
    public void check_pass1(){
        assertFalse(validator.validate("test"));
    }

    @Test
    public void check_pass2(){
        assertFalse(validator.validate("password"));
    }
}
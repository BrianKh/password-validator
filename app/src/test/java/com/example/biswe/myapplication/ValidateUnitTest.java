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
    public void check_passLenght(){
        assertFalse(validator.validate("!;ES"));
    }

    @Test
    public void check_passNotPassword(){
        assertFalse(validator.validate("password"));
    }

    @Test
    public void check_passAllLow(){
        assertFalse(validator.validate("1;noupperinthisstring"));
    }

    @Test
    public void check_passAllUp(){
        assertFalse(validator.validate("1;ALLUPINTHISSTRING"));
    }

    @Test
    public void check_passContainsSpecial(){
        assertFalse(validator.validate("1ContainsAllButSpecial"));
    }
    @Test
    public void check_passContainsDigit(){
        assertFalse(validator.validate("!AllBesidesDigit"));
    }
    @Test
    public void check_all(){
        assertTrue(validator.validate("!AllOfThemAreHere1"));
    }
}
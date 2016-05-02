package com.example.android.testingexample;

import com.example.android.testingexample.validator.EmailValidator;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by mac on 5/1/16.
 */
public class EmailValidatorTest {

    @Test
    public void testValidator() {
        Assert.assertTrue(EmailValidator.isValidEmail("miguetv17@gmail.com"));
        Assert.assertFalse(EmailValidator.isValidEmail("miguetv17@gmail"));
    }

}

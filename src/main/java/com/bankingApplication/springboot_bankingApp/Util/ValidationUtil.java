package com.bankingApplication.springboot_bankingApp.Util;

import org.apache.commons.lang3.RandomStringUtils;

public class ValidationUtil {

    public ValidationUtil(){}

    public static String generateAccountId(){
        return RandomStringUtils.randomAlphanumeric(6);
    }
}

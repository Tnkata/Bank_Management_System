package com.bankingApplication.springboot_bankingApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import static com.bankingApplication.springboot_bankingApp.Constants.AccountConstants.ACCOUNT_ID;

public class AccountResponse {

    @JsonProperty(ACCOUNT_ID)
    private String accountId;
}

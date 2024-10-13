package com.bankingApplication.springboot_bankingApp.Model;

import static com.bankingApplication.springboot_bankingApp.Constants.AccountConstants.ACCOUNT_ID;
import static com.bankingApplication.springboot_bankingApp.Constants.AccountConstants.ACCOUNT_BALANCE;
import static com.bankingApplication.springboot_bankingApp.Constants.AccountConstants.FIRST_NAME;
import static com.bankingApplication.springboot_bankingApp.Constants.AccountConstants.LAST_NAME;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;



@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountResponse {
    @JsonProperty(ACCOUNT_ID)
    private String accountId;

    @JsonProperty(ACCOUNT_BALANCE)
    private String balance;

    @JsonProperty(FIRST_NAME)
    private String firstName;

    @JsonProperty(LAST_NAME)
    private String lastName;
}

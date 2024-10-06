package com.bankingApplication.springboot_bankingApp.Model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Transaction {

    private String accountName;

    private String amount;
}

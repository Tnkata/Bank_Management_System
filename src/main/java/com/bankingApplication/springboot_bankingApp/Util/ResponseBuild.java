package com.bankingApplication.springboot_bankingApp.Util;

import com.bankingApplication.springboot_bankingApp.Model.AccountRequest;
import com.bankingApplication.springboot_bankingApp.Model.AccountResponse;
import reactor.core.publisher.Mono;

public enum ResponseBuild {

    INSTANCE;

    ResponseBuild(){}

    public static Mono<AccountResponse> buildAccountCreationResponse(final AccountRequest accountRequest, final String accountId){

        AccountResponse accountResponse =
                AccountResponse.builder()
                        .accountId(accountId)
                        .balance(accountRequest.getFee())
                        .firstName(accountRequest.getFirstName())
                        .lastName(accountRequest.getLastName())
                        .build();

        return Mono.just(accountResponse);
    }
}

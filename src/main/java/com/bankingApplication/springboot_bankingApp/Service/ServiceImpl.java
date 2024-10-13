package com.bankingApplication.springboot_bankingApp.Service;

import com.bankingApplication.springboot_bankingApp.Model.AccountRequest;
import com.bankingApplication.springboot_bankingApp.Model.AccountResponse;
import com.bankingApplication.springboot_bankingApp.Util.ResponseBuild;
import com.bankingApplication.springboot_bankingApp.Util.ValidationUtil;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@Component
public class ServiceImpl {

    public Mono<AccountResponse> createAccountService(AccountRequest accountRequest) {
        String getAccountNumber = ValidationUtil.generateAccountId();
        return ResponseBuild.buildAccountCreationResponse(accountRequest, getAccountNumber);
    }
}

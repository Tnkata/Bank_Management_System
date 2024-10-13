package com.bankingApplication.springboot_bankingApp.Controller;

import static com.bankingApplication.springboot_bankingApp.Constants.ApiConstants.CREATE_ACCOUNT_ENDPOINT;
import static com.bankingApplication.springboot_bankingApp.Constants.ApiConstants.GET_ACCOUNT_ENDPOINT;
import static com.bankingApplication.springboot_bankingApp.Constants.ApiConstants.UPDATE_ACCOUNT_ENDPOINT;
import static com.bankingApplication.springboot_bankingApp.Constants.ApiConstants.DELETE_ACCOUNT_ENDPOINT;

import com.bankingApplication.springboot_bankingApp.Model.AccountRequest;
import com.bankingApplication.springboot_bankingApp.Model.AccountResponse;
import com.bankingApplication.springboot_bankingApp.Service.ServiceImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class Controller {

    private final ServiceImpl service;

    public Controller(ServiceImpl service){
        this.service = service;
    }

    private static final Log log = LogFactory.getLog(Controller.class);

    @PostMapping(CREATE_ACCOUNT_ENDPOINT)
    public Mono<ResponseEntity<AccountResponse>> createAccount(@RequestBody AccountRequest accountRequest){
        log.info("Creating Customer Account...");


        return service.createAccountService(accountRequest)
                .map(accountResponse -> {
                   log.info("Account Created..");

                   return ResponseEntity.ok().body(accountResponse);
                });
    }

    @GetMapping(GET_ACCOUNT_ENDPOINT)
    public Mono<AccountResponse> getAccount(){
        log.info("Fetching Customer Account...");
        return null;
    }

    @PutMapping(UPDATE_ACCOUNT_ENDPOINT)
    public Mono<AccountResponse> updateAccount(){
        log.info("Updating Customer Account...");
        return null;
    }

    @DeleteMapping(DELETE_ACCOUNT_ENDPOINT)
    public Mono<AccountResponse> deleteAccount(){
        log.info("Deleting Customer Account...");
        return null;
    }
}

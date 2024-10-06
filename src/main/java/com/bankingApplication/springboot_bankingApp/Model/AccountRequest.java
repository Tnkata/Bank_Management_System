package com.bankingApplication.springboot_bankingApp.Model;

import static com.bankingApplication.springboot_bankingApp.Constants.ErrorMessageConstants.INVALID_ERROR_MESSAGE;
import static com.bankingApplication.springboot_bankingApp.Constants.AccountConstants.FIRST_NAME;
import static com.bankingApplication.springboot_bankingApp.Constants.AccountConstants.LAST_NAME;
import static com.bankingApplication.springboot_bankingApp.Constants.AccountConstants.INITIAL_FEE;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Builder
public class AccountRequest {

    @JsonProperty(FIRST_NAME)
    @NotNull(message = INVALID_ERROR_MESSAGE)
    private String firstName;

    @JsonProperty(LAST_NAME)
    @NotNull(message = INVALID_ERROR_MESSAGE)
    private String lastName;

    @JsonProperty(INITIAL_FEE)
    @NotNull(message = INVALID_ERROR_MESSAGE)
    private String fee;

    @JsonProperty()
    private String customerId;
}

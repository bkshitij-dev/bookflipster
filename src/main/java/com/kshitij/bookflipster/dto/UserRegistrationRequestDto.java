package com.kshitij.bookflipster.dto;

/*
 * @author Kshitij
 * @created 12-Jun-2025
 */

import com.kshitij.bookflipster.constant.MessageConstant;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserRegistrationRequestDto {

    @NotNull(message = MessageConstant.REQUEST_EMAIL_MANDATORY)
    @NotBlank(message = MessageConstant.REQUEST_EMAIL_MANDATORY)
    private String email;

    @NotNull(message = MessageConstant.REQUEST_USERNAME_MANDATORY)
    @NotBlank(message = MessageConstant.REQUEST_USERNAME_MANDATORY)
    private String username;

    @NotNull(message = MessageConstant.REQUEST_PASSWORD_MANDATORY)
    @NotBlank(message = MessageConstant.REQUEST_PASSWORD_MANDATORY)
    private String password;

}

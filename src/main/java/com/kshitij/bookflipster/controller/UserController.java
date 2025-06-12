package com.kshitij.bookflipster.controller;

/*
 * @author Kshitij
 * @created 12-Jun-2025
 */

import com.kshitij.bookflipster.constant.MessageConstant;
import com.kshitij.bookflipster.dto.MessageResponseDto;
import com.kshitij.bookflipster.dto.UserRegistrationRequestDto;
import com.kshitij.bookflipster.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Tag(name = "User", description = "APIs related to user")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    @Operation(summary = "Register user")
    ResponseEntity<MessageResponseDto> register(@Valid @RequestBody UserRegistrationRequestDto request) {
        userService.register(request);
        return new ResponseEntity<>(new MessageResponseDto(MessageConstant.USER_REGISTRATION_SUCCESS),
                HttpStatus.CREATED);
    }
}

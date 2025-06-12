package com.kshitij.bookflipster.service.impl;

import com.kshitij.bookflipster.dto.UserRegistrationRequestDto;
import com.kshitij.bookflipster.model.User;
import com.kshitij.bookflipster.repository.UserRepository;
import com.kshitij.bookflipster.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/*
 * @author Kshitij
 * @created 12-Jun-2025
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void register(UserRegistrationRequestDto request) {
        userRepository.save(User.builder()
                .email(request.getEmail())
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .build());
    }
}

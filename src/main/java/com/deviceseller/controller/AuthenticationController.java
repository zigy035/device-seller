package com.deviceseller.controller;

import com.deviceseller.model.User;
import com.deviceseller.service.AuthenticationService;
import com.deviceseller.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/authentication")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    private final UserService userService;

    @RequestMapping("/sign-up")
    public ResponseEntity<?> signUp(@RequestBody User user) {
        if (userService.findByUsername(user.getUsername()).isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userService.saveUser(user));
    }

    @RequestMapping("/sign-in")
    public ResponseEntity<?> signIn(@RequestBody User user) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(authenticationService.signInAndReturnJwt(user));
    }


}

package org.example.user.controller;

import org.example.core.wrapper.ResultResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis/user")
public class UserController {

    @Value("${test.property.value}")
    private String test;

    @Value("${test.vault.param}")
    private String vaultTest;

    @GetMapping("/home")
    public ResultResponse<Void> home() {
        return new ResultResponse<>();
    }
}

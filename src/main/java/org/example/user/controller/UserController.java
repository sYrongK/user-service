package org.example.user.controller;

import org.example.core.wrapper.ResultResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/apis/user")
public class UserController {

    @Value("${test.property.vault}")
    private String test;

    @GetMapping("/home")
    public ResultResponse<Void> home() {
        return new ResultResponse<>();
    }
}

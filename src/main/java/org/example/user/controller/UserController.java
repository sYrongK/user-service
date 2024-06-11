package org.example.user.controller;

import org.example.core.wrapper.ResultResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/apis/user")
public class UserController {

    @GetMapping("/home")
    public ResultResponse<Void> home() {
        return new ResultResponse<>();
    }
}

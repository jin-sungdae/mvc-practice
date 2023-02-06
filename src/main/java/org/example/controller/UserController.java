package org.example.controller;

import org.example.annotation.Controller;
import org.example.annotation.Inject;
import org.example.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Inject
    private UserService getUserService() {
        return userService;
    }
}

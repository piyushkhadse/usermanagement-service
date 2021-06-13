package com.twitter.usermanagementservice.controller;

import com.twitter.usermanagementservice.command.CreateUser;
import com.twitter.usermanagementservice.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class UserManagementController {
    private static final String USERS_RESOURCE_URI = "/users";

    @Autowired
    private UserManagementService userManagementService;

    @PostMapping(value = USERS_RESOURCE_URI)
    public ResponseEntity doUser(@RequestBody CreateUser createUser) {
        return new ResponseEntity(HttpStatus.OK);
    }

}

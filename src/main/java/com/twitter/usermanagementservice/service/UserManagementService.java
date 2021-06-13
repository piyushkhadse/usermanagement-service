package com.twitter.usermanagementservice.service;

import com.twitter.usermanagementservice.command.CreateUser;
import com.twitter.usermanagementservice.domain.User;

public interface UserManagementService {
    User createUser(CreateUser createUser);
}

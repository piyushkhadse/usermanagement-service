package com.twitter.usermanagementservice.service.impl;

import com.twitter.usermanagementservice.command.CreateUser;
import com.twitter.usermanagementservice.domain.User;
import com.twitter.usermanagementservice.repository.UserManagementRepository;
import com.twitter.usermanagementservice.service.UserManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserManagementServiceImpl implements UserManagementService {

    private UserManagementRepository userManagementRepository;

    @Override
    public User createUser(CreateUser createUser) {
        User user = new User(createUser);
        return userManagementRepository.save(user);
    }
}

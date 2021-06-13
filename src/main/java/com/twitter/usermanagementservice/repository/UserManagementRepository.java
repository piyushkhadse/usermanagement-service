package com.twitter.usermanagementservice.repository;

import com.twitter.usermanagementservice.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserManagementRepository extends MongoRepository<User, String> {
}

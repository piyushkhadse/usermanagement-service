package com.twitter.usermanagementservice.domain;


import com.twitter.usermanagementservice.command.CreateUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("users")
public class User {
    private String _id;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String countryCode;
    private String email;
    private String dateOfBirth;
    private String password;

    public User(CreateUser user) {
        this._id = UUID.randomUUID().toString();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.mobileNumber = user.getMobileNumber();
        this.countryCode = user.getCountryCode();
        this.email = user.getEmail();
        this.dateOfBirth = user.getDateOfBirth();
        this.password = user.getPassword();
    }
}

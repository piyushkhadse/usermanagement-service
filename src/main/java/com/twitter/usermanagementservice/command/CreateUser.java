package com.twitter.usermanagementservice.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUser {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String countryCode;
    private String email;
    private String dateOfBirth;
    private String password;

}

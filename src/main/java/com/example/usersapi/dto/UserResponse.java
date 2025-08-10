package com.example.usersapi.dto;

import com.example.usersapi.model.User;
import com.example.usersapi.model.UserRole;

import java.time.OffsetDateTime;
import java.util.UUID;

public class UserResponse {
    private UUID id;
    private String name;
    private String email;
    private String login;
    private String address;
    private OffsetDateTime lastModifiedAt;
    private UserRole role;

    public static UserResponse from(User user) {
        UserResponse r = new UserResponse();
        r.id = user.getId();
        r.name = user.getName();
        r.email = user.getEmail();
        r.login = user.getLogin();
        r.address = user.getAddress();
        r.lastModifiedAt = user.getLastModifiedAt();
        r.role = user.getRole();
        return r;
    }

    public UUID getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getLogin() { return login; }
    public String getAddress() { return address; }
    public OffsetDateTime getLastModifiedAt() { return lastModifiedAt; }
    public UserRole getRole() { return role; }
}




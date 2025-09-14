package com.jobportal.dto;

import com.jobportal.entity.User;

public class UserDto {
    private String id;
    private String name;
    private String email;
    private String password;
    private AccountType accountType;

    // No-args constructor
    public UserDto() {}

    // All-args constructor
    public UserDto(String id, String name, String email, String password, AccountType accountType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.accountType = accountType;
    }

    // Getters/Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public AccountType getAccountType() { return accountType; }
    public void setAccountType(AccountType accountType) { this.accountType = accountType; }

    // Convert DTO → Entity
    public User toEntity() {
        return new User(this.id, this.name, this.email, this.password, this.accountType);
    }
}

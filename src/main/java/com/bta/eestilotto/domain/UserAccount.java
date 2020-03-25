package com.bta.eestilotto.domain;

public class UserAccount {
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String userPassword;
    private Long isikuKood;
    private String email;

    public UserAccount(Long id, String firstName, String lastName, String userName, String userPassword, Long isikuKood, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.isikuKood = isikuKood;
        this.email = email;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getIsikuKood() {
        return isikuKood;
    }

    public void setIsikuKood(Long isikuKood) {
        this.isikuKood = isikuKood;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

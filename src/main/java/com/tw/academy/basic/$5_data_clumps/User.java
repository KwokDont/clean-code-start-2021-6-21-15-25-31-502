package com.tw.academy.basic.$5_data_clumps;

public class User {
    private String userName;
    private String userPhoneNumber;
    private String userAddress;

    public User(String userName, String userPhoneNumber, String userAddress) {
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public String getUserAddress() {
        return userAddress;
    }
}

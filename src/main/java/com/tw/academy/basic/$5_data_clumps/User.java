package com.tw.academy.basic.$5_data_clumps;

public class User {
    private final String userName;
    private final String userPhoneNumber;
    private final String buyerAddress;

    public User(String buyerName, String buyerPhoneNumber, String buyerAddress) {
        userName = buyerName;
        userPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }
}

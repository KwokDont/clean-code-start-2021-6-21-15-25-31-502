package com.tw.academy.basic.$3_feature_envy.practiceOne;

public class Phone {
    private final String unformattedNumber;
    private String areaCode;
    private String prefix;
    private String number;

    public Phone(String unformattedNumber) {
        this.unformattedNumber = unformattedNumber;
        this.areaCode = unformattedNumber.substring(0,3);
        this.prefix = unformattedNumber.substring(3,6);
        this.number = unformattedNumber.substring(6,10);
    }

    public String getMobilePhoneNumber() {
        return "(" + this.areaCode + ")" +
                this.prefix + "-" + this.number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getNumber() {
        return number;
    }
}

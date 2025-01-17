package com.tw.academy.basic.$7_long_method;

import java.util.List;

public class Order {
    private String customerName;
    private String address;
    private List<LineItem> lineItems;

    public Order(String customerName, String address, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.address = address;
        this.lineItems = lineItems;
    }

    public String getCustomerInfo() {
        return customerName + address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}

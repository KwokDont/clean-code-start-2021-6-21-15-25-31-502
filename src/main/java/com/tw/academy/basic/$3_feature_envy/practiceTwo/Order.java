package com.tw.academy.basic.$3_feature_envy.practiceTwo;

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

    public double calculateTotalPrice() {
        return lineItems.stream()
                .mapToDouble(LineItem::getSubItemAmount)
                .sum();
    }

}

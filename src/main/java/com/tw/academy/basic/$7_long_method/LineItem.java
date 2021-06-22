package com.tw.academy.basic.$7_long_method;

public class LineItem {
	private String description;
	private double price;
	private int quantity;

	public LineItem(String description, double price, int quantity) {
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	public String genLineItemPrintInfo() {
		return description + "\t"
				+ price + "\t"
				+ quantity + "\t"
				+ totalAmount() + "\n";
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

    double totalAmount() {
        return price * quantity;
    }
}
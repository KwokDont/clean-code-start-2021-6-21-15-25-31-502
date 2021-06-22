package com.tw.academy.basic.$7_long_method;

import static com.tw.academy.basic.$7_long_method.OrderConstant.NEXT_LINE;
import static com.tw.academy.basic.$7_long_method.OrderConstant.TAB;

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
		return description + TAB
				+ price + TAB
				+ quantity + TAB
				+ totalAmount() + NEXT_LINE;
	}

    double totalAmount() {
        return price * quantity;
    }
}
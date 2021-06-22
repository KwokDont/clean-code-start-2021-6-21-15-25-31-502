package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private Order order;

    public static final String PRINT_TITLE = "======Printing Orders======\n";
    public static final String SALE_TAX = "Sales Tax";
    public static final String TOTAL_AMOUNT = "Total Amount";

    public OrderReceipt(Order order) {
        this.order = order;
    }

    //Deprecated
    public String getCustomerName() {
        return order.getCustomerName();
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        output.append(PRINT_TITLE);

        output.append(order.getCustomerInfo());

        // prints lineItems
        double totalSalesTax = 0d;
        double totalAmount = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append('\t');
            output.append(lineItem.getPrice());
            output.append('\t');
            output.append(lineItem.getQuantity());
            output.append('\t');
            output.append(lineItem.totalAmount());
            output.append('\n');

            // calculate sales tax @ rate of 10%
            double salesTax = lineItem.totalAmount() * .10;
            totalSalesTax += salesTax;

            // calculate total amount of lineItem = price * quantity + 10 % sales tax
            totalAmount += lineItem.totalAmount() + salesTax;
        }

        // prints the state tax
        output.append(SALE_TAX).append('\t').append(totalSalesTax);

        // print total amount
        output.append(TOTAL_AMOUNT).append('\t').append(totalAmount);
        return output.toString();
    }
}
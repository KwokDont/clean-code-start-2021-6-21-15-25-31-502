package com.tw.academy.basic.$7_long_method;

import static com.tw.academy.basic.$7_long_method.OrderConstant.*;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private Order order;

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
            output.append(lineItem.genLineItemPrintInfo());

            // calculate sales tax @ rate of 10%
            totalSalesTax += lineItem.getItemSalesTax();

            // calculate total amount of lineItem = price * quantity + 10 % sales tax
            totalAmount += lineItem.getTotalAmountWithTax();
        }

        // prints the state tax
        output.append(SALE_TAX).append(TAB).append(totalSalesTax);

        // print total amount
        output.append(TOTAL_AMOUNT).append(TAB).append(totalAmount);
        return output.toString();
    }
}
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

        double totalSalesTax = 0d;
        double totalAmount = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.genLineItemPrintInfo());

            totalSalesTax += lineItem.getItemSalesTax();

            totalAmount += lineItem.getTotalAmountWithTax();
        }

        output.append(SALE_TAX).append(TAB).append(totalSalesTax);

        output.append(TOTAL_AMOUNT).append(TAB).append(totalAmount);
        return output.toString();
    }
}
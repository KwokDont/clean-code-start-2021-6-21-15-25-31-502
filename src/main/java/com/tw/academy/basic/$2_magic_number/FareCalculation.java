package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {

    public static final Integer EIGHT_DISC_FROM = 100;
    public static final Integer EIGHT_DISC_TO = 150;
    public static final Integer FIVE_DISC_FROM = 150;
    public static final Integer FIVE_DISC_TO = 400;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= EIGHT_DISC_FROM && cumulativeExpensesThisMonth < EIGHT_DISC_TO) {
            return originalPrice * 0.8;
        }
        if (cumulativeExpensesThisMonth >= FIVE_DISC_FROM && cumulativeExpensesThisMonth < FIVE_DISC_TO) {
            return originalPrice * 0.5;
        }
        return originalPrice;
    }
}

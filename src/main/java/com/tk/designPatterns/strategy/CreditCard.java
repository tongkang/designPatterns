package com.tk.designPatterns.strategy;

/**
 * 简述:信用卡类
 * <p>
 * 详细描述
 *
 * @author tongkang
 * @version 1.0
 * @since 2022/10/30
 */
public class CreditCard {

    private int amount;
    private String number;
    private String date;
    private String cvv;

    CreditCard(String number, String date, String cvv) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

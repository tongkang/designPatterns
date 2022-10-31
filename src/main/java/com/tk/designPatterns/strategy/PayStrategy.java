package com.tk.designPatterns.strategy;

/**
 * 简述
 * <p>
 * 详细描述
 *
 * @author tongkang
 * @version 1.0
 * @since 2022/10/30
 */
public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}

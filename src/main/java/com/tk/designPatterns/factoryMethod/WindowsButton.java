package com.tk.designPatterns.factoryMethod;

/**
 * 简述
 * <p>
 * 详细描述
 *
 * @author tongkang
 * @version 1.0
 * @since 2022/11/05
 */
public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>this windows Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click windows! Button says - 'Hello World!'");
    }
}

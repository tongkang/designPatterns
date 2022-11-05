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
public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        dialog.renderWindow();
    }

    static void configure() {
        // 可以根据一些业务判断，来进行选择
        dialog = new WindowsDialog();
//        dialog = new HtmlDialog();
    }
}

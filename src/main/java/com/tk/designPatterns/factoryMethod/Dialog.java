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
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}

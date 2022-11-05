package com.tk.designPatterns.singleton;

/**
 * 简述:The field must be declared volatile so that double check lock would work correctly.
 * <p>
 * 详细描述
 *
 * @author tongkang
 * @version 1.0
 * @since 2022/11/05
 */
public class Singleton {

    /**
     * 保存单例实例的成员变量必须被声明为静态类型。
     */
    private static volatile Singleton instance;

    public String value;

    /**
     * 单例的构造函数必须永远是私有类型，以防止使用`new`运算符直接调用构造方法。
     *
     * @param value
     */
    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // double-checked locking (DCL
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}

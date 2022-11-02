package com.tk.designPatterns.template;

/**
 * 简述
 * <p>
 * 详细描述
 *
 * @author tongkang
 * @version 1.0
 * @since 2022/11/02
 */
public class Twitter extends Network {
    public Twitter(String userName, String password) {
        this.userName = "tongkang123";
        this.password = "123456";
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("\n\nLogIn success on Twitter");
        return false;
    }

    @Override
    boolean sendData(byte[] data) {
        System.out.println("Message: '" + new String(data) + "' was posted on Twitter");
        return true;
    }

    @Override
    void logOut() {
        System.out.println("User: '" + userName + "' was logged out from Twitter");
    }
}

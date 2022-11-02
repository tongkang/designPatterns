package com.tk.designPatterns.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 简述
 * <p>
 * 详细描述
 *
 * @author tongkang
 * @version 1.0
 * @since 2022/11/02
 */
public class Demo {

    public static void main(String[] args) throws IOException {

        Network network = null;
        String userName = "tongkang";
        String password = "tongkang";
        String message = "this is fisrt message!!!";

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");


        new Facebook(userName, password).post(message);
    }
}

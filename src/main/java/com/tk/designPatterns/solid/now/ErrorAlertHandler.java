package com.tk.designPatterns.solid.now;

import com.tk.designPatterns.solid.original.AlertRule;
import com.tk.designPatterns.solid.original.Notification;
import com.tk.designPatterns.solid.original.NotificationEmergencyLevel;

/**
 * 简述
 * <p>
 * 详细描述
 *
 * @author tongkang
 * @version 1.0
 * @since 2022/11/14
 */
public class ErrorAlertHandler extends AlertHandler {

    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if ("判断条件".equals("")) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}

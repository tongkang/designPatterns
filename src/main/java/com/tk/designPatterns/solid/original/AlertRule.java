package com.tk.designPatterns.solid.original;

/**
 * 简述: 存储告警规则
 * <p>
 * 详细描述
 *
 * @author tongkang
 * @version 1.0
 * @since 2022/11/14
 */
public class AlertRule {

    private Integer getMaxTps;

    public Integer getGetMaxTps() {
        return getMaxTps;
    }

    public void setGetMaxTps(Integer getMaxTps) {
        this.getMaxTps = getMaxTps;
    }

    public AlertRule getMatchedRule(String api) {
        return null;
    }

    public long getMaxTps() {
        return 0;
    }

    public long getMaxErrorCount() {
        return 0;
    }

    public long getMaxTimeoutTps() {
        return 0;
    }
}

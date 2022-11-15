package com.tk.designPatterns.solid.now;

/**
 * 简述
 * <p>
 * 详细描述
 *
 * @author tongkang
 * @version 1.0
 * @since 2022/11/15
 */
public class Demo {

    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo(); // ... 省略设置 apiStatInfo 数据值的代码
        apiStatInfo.setTimeoutCount(289); // 改动四：设置 tiemoutCount 值
        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}

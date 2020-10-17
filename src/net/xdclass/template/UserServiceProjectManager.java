package net.xdclass.template;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class UserServiceProjectManager extends AbstractProjectManager {
    @Override
    public void coding() {
        System.out.println("开发耗时10天");
    }

    @Override
    public void test() {

        System.out.println("功能测试，压力测试,还有手工测试");
    }

    @Override
    public void online() {

        System.out.println("灰度发布，全量上线");
    }
}

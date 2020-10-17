package net.xdclass.command;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class ConditionReceiver {

    public void on(){
        System.out.println("空调开启了");
    }

    public void off(){
        System.out.println("空调关闭了");
    }

    public void cool(){
        System.out.println("空调开始制冷");
    }

    public void warm(){
        System.out.println("空调开始制暖");
    }
}

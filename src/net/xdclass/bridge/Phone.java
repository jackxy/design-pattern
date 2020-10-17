package net.xdclass.bridge;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description  抽象角色 手机
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public abstract class Phone {


    /**
     * 通过组合的方式来桥接其他行为
     */
    protected  Color color;


    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * 手机的方法
     */
    abstract public void run();

}

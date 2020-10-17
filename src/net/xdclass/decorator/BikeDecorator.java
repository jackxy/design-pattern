package net.xdclass.decorator;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class BikeDecorator implements Bike {

    private String description = "我只是装饰器，啥都不表示，子类帮我传递";




    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}

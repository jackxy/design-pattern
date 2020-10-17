package net.xdclass.proxy;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 真实的对象
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class DigitalSellReal implements DigitalSell{

    @Override
    public void sell() {

        System.out.println("销售华为手机");
    }
}

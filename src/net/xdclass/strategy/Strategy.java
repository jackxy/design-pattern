package net.xdclass.strategy;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public abstract class Strategy {

    /**
     *  根据简单订单对象，计算商品折扣后的价格
     * @param productOrder
     * @return
     */
    public abstract double computePrice(ProductOrder productOrder);

}

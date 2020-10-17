package net.xdclass.strategy;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class DiscountActivity extends  Strategy{

    /**
     * 具体的折扣
     */
    private double rate;

    public DiscountActivity(double rate){
        this.rate = rate;
    }

    @Override
    public double computePrice(ProductOrder productOrder) {
        //一系列复杂的计算

        return  productOrder.getOldPrice() * rate;

    }
}

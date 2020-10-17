package net.xdclass.strategy;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class PromotionContext {

    private Strategy strategy;

    public  PromotionContext(Strategy strategy){
        this.strategy = strategy;
    }


    /**
     * 根据策略计算最终的价格
     * @param productOrder
     * @return
     */
    public double executeStrategy(ProductOrder productOrder){
        return strategy.computePrice(productOrder);
    }

}

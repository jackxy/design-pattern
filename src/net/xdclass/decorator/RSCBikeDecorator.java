package net.xdclass.decorator;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description RSC 是防爆胎的缩写，角色 ConcreteDecorator
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class RSCBikeDecorator extends BikeDecorator {


    private String description = "增加一个防爆胎";


    private Bike bike;

    public RSCBikeDecorator(Bike bike){
        this.bike = bike;
    }


    @Override
    public String getDescription() {
        return bike.getDescription() + ","+ description;
    }

    /**
     * 100 是防爆胎的价格
     * @return
     */
    @Override
    public int getPrice() {
        return bike.getPrice() + 100;
    }
}

package net.xdclass.state;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class NewOrderState implements State{

    @Override
    public void handle() {
        System.out.println("新订单，未支付");
        System.out.println("调用商户客服服务，有新订单\n");
    }
}

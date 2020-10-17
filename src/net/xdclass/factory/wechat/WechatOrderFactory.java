package net.xdclass.factory.wechat;

import net.xdclass.factory.OrderFactory;
import net.xdclass.factory.PayFactory;
import net.xdclass.factory.RefundFactory;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class WechatOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
        return new WechatPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new WechatRefund();
    }
}

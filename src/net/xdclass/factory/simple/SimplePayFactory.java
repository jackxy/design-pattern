package net.xdclass.factory.simple;

import net.xdclass.factory.PayFactory;
import net.xdclass.factory.ali.AliPay;
import net.xdclass.factory.wechat.WechatPay;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class SimplePayFactory {


    /**
     * 根据参数 返回对应的支付对象
     *
     * @param payType
     * @return
     */
    public static PayFactory createPay(String payType) {

        if (payType == null) {
            return null;

        } else if (payType.equalsIgnoreCase("WECHAT_PAY")) {

            return new WechatPay();

        } else if (payType.equalsIgnoreCase("ALI_PAY")) {

            return new AliPay();
        }
        //想拓展，直接编写更多

        return null;

    }

}

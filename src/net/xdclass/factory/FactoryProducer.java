package net.xdclass.factory;

import net.xdclass.factory.ali.AliOrderFactory;
import net.xdclass.factory.wechat.WechatOrderFactory;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description  超级工厂创造器, 简单工厂模式
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/


public class FactoryProducer {

    public static OrderFactory getFactory(String type) {

        if (type.equalsIgnoreCase("WECHAT")) {
            return new WechatOrderFactory();

        } else if (type.equalsIgnoreCase("ALI")) {

            return new AliOrderFactory();
        }

        return null;

    }

}

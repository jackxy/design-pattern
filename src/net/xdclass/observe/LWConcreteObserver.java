package net.xdclass.observe;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 消息的消费者
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class LWConcreteObserver implements Observer {

    @Override
    public void update() {
        System.out.println("老王发现领导到来，暂停在线摸鱼，回归工作");
    }
}

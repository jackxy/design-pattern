package net.xdclass.proxy;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 代理对象，增加了功能
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class DigitalSellProxy implements DigitalSell {

    private DigitalSell realObj = new DigitalSellReal();

    @Override
    public void sell() {

        makeAddress();
        realObj.sell();
        makeAD();

    }



    private void makeAddress(){
        System.out.println("一个人流量很高的地址");
    }


    private void makeAD(){
        System.out.println("投放广告");
    }

}

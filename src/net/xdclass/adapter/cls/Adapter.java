package net.xdclass.adapter.cls;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class Adapter extends OldModule implements TargetModule {

    /**
     * 新的方法，和老的类方法不一样
     */
    @Override
    public void methodB() {
        System.out.println("Adapter methodB");
    }

    /**
     * 新的方法，和老的类方法不一样
     */
    @Override
    public void methodC() {
        System.out.println("Adapter methodC");
    }


}

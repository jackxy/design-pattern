package net.xdclass.single;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 单例设计 饿汉方式
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry(){}

    public static SingletonHungry getInstance(){
        return instance;
    }

    /**
     * 单例对象的方法
     */
    public void process(){
        System.out.println("方法调用成功");
    }


}

package net.xdclass.observe;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class BossConcreteSubject extends Subject {

    public void doSomething(){
        System.out.println("老板完成自己的工作");

        //还有其他操作
        System.out.println("视察公司工作情况");
        super.notifyAllObserver();

    }
}

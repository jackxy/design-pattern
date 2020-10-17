package net.xdclass.template;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public abstract  class AbstractProjectManager {


    /**
     * 定义模板方法，声明final，防止子类覆盖他，更改顺序，流程是一样复用
     */

    public final void processProject(){

        review();

        degisn();

        coding();

        test();

        online();

    }


    /**
     * 各个项目都需要评审,具体方法
     */
    public void review(){
        System.out.println("项目需求评审");
    }


    /**
     * 各个项目都需要设计，具体方法
     */
    public void degisn(){
        System.out.println("UI UE进行设计");
    }

    /**
     * 抽象方法，由就具体子类进行实现，编码耗时不一样
     */
    public abstract void coding();



    /**
     * 抽象方法，由就具体子类进行实现，测试有多种，自动化测试、安全测试、压力测试、手工测试
     */
    public abstract void test();


    /**
     * 抽象方法，由就具体子类进行实现，上线有全量发布，灰度发布，停机发布
     */
    public abstract void online();



}

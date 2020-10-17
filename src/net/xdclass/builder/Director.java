package net.xdclass.builder;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 将产品和创建过程进行解耦，使用相同的创建过程创建不同的产品，控制产品生产过程
 *               Director是全程指导组装过程，具体的细节还是builder去操作
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class Director {

    public Computer craete(Builder builder){

        builder.buildMemory();
        builder.buildCpu();
        builder.buildMainboard();
        builder.buildDisk();
        builder.buildPower();

        return builder.createComputer();

    }

}

package net.xdclass.iterator;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 抽象容器建立了
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public interface ICollection {

    void add(Object obj);

    void remove(Object obj);

    Iterator iterator();
}

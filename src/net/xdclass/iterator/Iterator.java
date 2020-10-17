package net.xdclass.iterator;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 抽象迭代器
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public interface Iterator {

    /**
     * 获取下个元素
     * @return
     */
    Object next();


    /**
     * 是否有下一个
     * @return
     */
    boolean hasNext();


    /**
     * 删除元素
     * @param obj
     * @return
     */
    Object remove(Object obj);

}

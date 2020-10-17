package net.xdclass.iterator;

import java.util.List;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 具体的迭代器
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class ConcreteIterator implements Iterator {

    private List list;

    private int index = 0;

    public ConcreteIterator(List list){
        this.list = list;
    }


    @Override
    public Object next() {

        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(index);
            index++;
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if(index == list.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object remove(Object obj) {
        return list.remove(obj);
    }
}

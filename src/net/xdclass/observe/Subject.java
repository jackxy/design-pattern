package net.xdclass.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 消息发布者
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    /**
     * 新增观察者
     * @param observer
     */
    public void addObserver(Observer observer){
        this.observerList.add(observer);
    }


    /**
     *删除观察者
     * @param observer
     */
    public void deleteObserver(Observer observer){
        this.observerList.remove(observer);
    }


    public void notifyAllObserver(){
        for(Observer observer:this.observerList){
            observer.update();
        }
    }


}

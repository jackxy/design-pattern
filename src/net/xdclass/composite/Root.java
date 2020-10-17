package net.xdclass.composite;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 根节点，抽象类，通用的属性和方法
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public abstract class Root {

    private String name;

    public Root(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void addFile(Root root);

    public abstract void removeFile(Root root);

    public abstract void display(int depth);

}

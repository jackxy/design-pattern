package net.xdclass.flyweight;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class ConcreteWebSite extends CloudWebSite {

    private String category;

    public  ConcreteWebSite(String category){
        this.category = category;
    }


    @Override
    public void run(Company company) {
        System.out.println("网站分类："+category+", 公司："+company.getName());

    }
}

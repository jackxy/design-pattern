package net.xdclass.prototype;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class Client {

    public static void main(String [] args) throws CloneNotSupportedException {

        Person person1 = new Person();
        person1.setAge(10);
        person1.setName("小滴课堂-老王");
        person1.getList().add("aaa");


        //浅拷贝
        Person person2 =  person1.clone();

        //深拷贝
        //Person person2 =  (Person) person1.deepClone();
        person2.setName("Anna小姐姐");
        person2.getList().add("ccc");

        System.out.println("person1="+person1.getName()+", age="+person1.getAge());
        System.out.println("person2="+person2.getName()+", age="+person2.getAge());

    }
}

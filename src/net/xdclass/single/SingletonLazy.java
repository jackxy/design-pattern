package net.xdclass.single;


/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 单例设计模式 - 懒汉实现方式
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class SingletonLazy {


    //private static SingletonLazy instance;
    /**
     * 构造函数私有化
     */
    private SingletonLazy(){}


    /**
     * 单例对象的方法
     */
    public void process(){
        System.out.println("方法调用成功");
    }

    /**
     * 第一种方式
     * 对外暴露一个方法获取类的对象
     *
     * 线程不安全，多线程下存在安全问题
     *
     */
//    public static SingletonLazy getInstance(){
//        if(instance == null){
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }


    /**
     * 第二种实现方式
     *  通过加锁 synchronized 保证单例
     *
     * 采用synchronized 对方法加锁有很大的性能开销
     *
     * 解决办法：锁粒度不要这么大
     *
     * @return
     */
//    public static synchronized SingletonLazy getInstance(){
//        if(instance == null){
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }


    /**
     * 第三种实现方式
     *
     * DCL 双重检查锁定 （Double-Checked-Locking）,在多线程情况下保持高性能
     *
     * 这是否安全，instance = new SingletonLazy(); 并不是原子性操作
     * 1、分配空间给对象
     * 2、在空间内创建对象
     * 3、将对象赋值给引用instance
     *
     * 假如线程 1-》3-》2顺序，会把值写会主内存，其他线程就会读取到instance最新的值，但是这个是不完全的对象
     * (指令重排)
     * @return
     */
//    public static  SingletonLazy getInstance(){
//        if(instance == null){
//            // A、B
//            synchronized (SingletonLazy.class){
//                if(instance == null) {
//                    instance = new SingletonLazy();
//                }
//            }
//        }
//        return instance;
//    }


    /**
     * volatile是Java提供的关键字，它具有可见性和有序性，
     *
     * 指令重排序是JVM对语句执行的优化，只要语句间没有依赖，那JVM就有权对语句进行优化
     *
     * 禁止了指令重排
     */
    private static volatile SingletonLazy instance;
    public static  SingletonLazy getInstance(){
        //第一重检查
        if(instance == null){
            // A、B ，锁定
            synchronized (SingletonLazy.class){
                //第二重检查
                if(instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }


}

package net.xdclass.adapter.cls;

public interface TargetModule {

    /**
     * 和需要适配的类方法名一样
     */
    void methodA();

    /**
     * 新的方法,如果有多个新的方法直接编写就行
     */
    void methodB();

    void methodC();

}

package net.xdclass.builder;

/**
 * 声明了建造者的公共方法
 */
public interface Builder {

    /**
     *细节方法
     */
    void buildCpu();

    void buildMainboard();

    void buildDisk();

    void buildPower();

    void buildMemory();

    Computer createComputer();

}

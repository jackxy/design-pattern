package net.xdclass.builder;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 具体的建造者，实现builder来创建不同的产品
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class HighComputerBuilder implements Builder{

    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("高配 CPU");
    }

    @Override
    public void buildMainboard() {
        computer.setMainboard("高配 主板");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("高配 磁盘");
    }

    @Override
    public void buildPower() {
        computer.setPower("高配 电源");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("高配 内存");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}

package net.xdclass.command;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class AppInvoker {


    private Command onCommand;
    private Command offCommand;

    private Command coolCommand;
    private Command warmCommand;


    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }

    public void setCoolCommand(Command coolCommand) {
        this.coolCommand = coolCommand;
    }

    public void setWarmCommand(Command warmCommand) {
        this.warmCommand = warmCommand;
    }


    /**
     * 开机
     */
    public void on(){
        onCommand.execute();
    }

    /**
     * 关机
     */
    public void off(){
        offCommand.execute();
    }

    public void warm(){
        warmCommand.execute();
    }

    public void cool(){
        coolCommand.execute();
    }

}

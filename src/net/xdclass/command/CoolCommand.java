package net.xdclass.command;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class CoolCommand implements Command{

    /**
     * 对哪个receiver 进行命令处理
     */
    private ConditionReceiver receiver;

    public CoolCommand(ConditionReceiver receiver){
        this.receiver = receiver;
    }

    /**
     * 必须实现一个命令的调用
     */
    @Override
    public void execute() {

        System.out.println("CoolCommand -> execute");
        receiver.cool();

    }
}

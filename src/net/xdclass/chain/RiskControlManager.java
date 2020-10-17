package net.xdclass.chain;

/**
 * 小滴课堂,愿景：让技术不再难学  https://xdclass.net
 *
 * @Description 风控级别抽象类
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群 微信 xdclass6
 * @Version 1.0
 **/

public abstract class RiskControlManager {

    protected  String name;

    /**
     * 更严格的风控策略
     */
    protected RiskControlManager superior;

    public RiskControlManager(String name){
        this.name = name;
    }


    /**
     * 设置更严格的风控策略
     * @param superior
     */
    public void setSuperior(RiskControlManager superior){
        this.superior = superior;
    }


    /**
     * 处理请求
     * @param request
     */
    public abstract void handlerRequest(Request request);

}

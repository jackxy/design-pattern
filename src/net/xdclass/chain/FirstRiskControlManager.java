package net.xdclass.chain;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class FirstRiskControlManager extends RiskControlManager {

    public FirstRiskControlManager(String name) {
        super(name);
    }

    /**
     *  1000元以内可以直接处理
     * @param request
     */
    @Override
    public void handlerRequest(Request request) {

        if(RequestType.valueOf(request.getRequestType())!=null && request.getMoney()<=1000){

            System.out.println("普通操作，输入支付密码即可");

            System.out.println(name+":"+request.getRequestType() + ", 金额:"+request.getMoney() +" 处理完成");

        }else {

            //下个节点进行处理
            if(superior!=null){
                superior.handlerRequest(request);
            }
        }

    }
}

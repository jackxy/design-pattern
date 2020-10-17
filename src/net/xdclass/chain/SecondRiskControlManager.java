package net.xdclass.chain;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class SecondRiskControlManager extends RiskControlManager {

    public SecondRiskControlManager(String name) {
        super(name);
    }

    /**
     * 处理 1千到1万之间
     * @param request
     */
    @Override
    public void handlerRequest(Request request) {
        if(RequestType.valueOf(request.getRequestType())!=null && request.getMoney()>1000 && request.getMoney()<10000){

            System.out.println("稍大额操作，输入支付密码+短信验证码即可");

            System.out.println(name+":"+request.getRequestType() + ", 金额:"+request.getMoney() +" 处理完成");

        }else {

            //下个节点进行处理
            if(superior!=null){
                superior.handlerRequest(request);
            }
        }
    }
}

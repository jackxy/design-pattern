package net.xdclass.facade;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class MessageFacade implements ImessageManager{

    private ImessageManager wechatMsgManager = new WechatMessageManager();

    private ImessageManager smsMsgManager = new SmsMessageManager();

    private ImessageManager mailMsgManager = new MailMessageManager();

    private ImessageManager dingdingMsgManager = new DingDingMessageManager();


    @Override
    public void pushMessage() {
        wechatMsgManager.pushMessage();
        smsMsgManager.pushMessage();
        mailMsgManager.pushMessage();
        dingdingMsgManager.pushMessage();

    }
}

package net.xdclass.factory;

/**
 * 超级工厂，定义同个产品族的其他相关子工厂
 */
public interface OrderFactory {

    PayFactory createPay();

    RefundFactory createRefund();


}

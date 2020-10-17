package net.xdclass.strategy;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class VoucherActivity extends Strategy {

    /**
     * 传入优惠券
     */
    private double voucher;

    public  VoucherActivity(double voucher){
        this.voucher = voucher;
    }

    @Override
    public double computePrice(ProductOrder productOrder) {

        if(productOrder.getOldPrice() > voucher){
            return productOrder.getOldPrice() - voucher;
        }else {
            return 0;
        }

    }
}

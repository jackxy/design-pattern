package net.xdclass.memento;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description  快照，备忘录
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class RoleStateMemento {


    /**
     * 生命力，会下降
     */
    private int live;

    /**
     * 攻击力，会上涨
     */
    private int attack ;

    public RoleStateMemento(int live, int attack) {
        this.live = live;
        this.attack = attack;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}

import net.xdclass.chain.*;
import net.xdclass.command.*;
import net.xdclass.iterator.ICollection;
import net.xdclass.iterator.Iterator;
import net.xdclass.iterator.MyCollection;
import net.xdclass.memento.RoleOriginator;
import net.xdclass.memento.RoleStateCaretaker;
import net.xdclass.observe.AnnaConcreteObserver;
import net.xdclass.observe.BossConcreteSubject;
import net.xdclass.observe.LWConcreteObserver;
import net.xdclass.observe.Observer;
import net.xdclass.state.NewOrderState;
import net.xdclass.state.OrderContext;
import net.xdclass.state.PayOrderState;
import net.xdclass.state.SendOrderState;
import net.xdclass.strategy.*;
import net.xdclass.template.AbstractProjectManager;
import net.xdclass.template.PayServiceProjectManager;
import net.xdclass.template.UserServiceProjectManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        OrderContext orderContext = new OrderContext();

        orderContext.setState(new NewOrderState());

        orderContext.setState(new PayOrderState());

        orderContext.setState(new SendOrderState());

    }
}

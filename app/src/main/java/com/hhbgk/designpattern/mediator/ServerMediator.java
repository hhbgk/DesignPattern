package com.hhbgk.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者（ConcreteMediator）角色：实现中介者接口，定义一个 List 来管理同事对象，
 * 协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 */
public class ServerMediator implements IMediator {
    private List<AbstractColleague> colleagues = new ArrayList<>();

    @Override
    public void register(AbstractColleague colleague) {
        if (!colleagues.contains(colleague))
            colleagues.add(colleague);
    }

    @Override
    public void relay(AbstractColleague colleague) {
        for (AbstractColleague c : colleagues) {
            if (!c.equals(colleague)) {
                c.receive();
            }
        }
    }
}

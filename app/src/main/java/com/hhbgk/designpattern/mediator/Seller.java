package com.hhbgk.designpattern.mediator;

import android.util.Log;

/**
 * 具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，
 * 由中介者对象负责后续的交互。
 */
public class Seller extends AbstractColleague {
    public Seller(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void receive() {
        Log.i(tag, "Hello buyer, I'm seller");
    }

    @Override
    public void send() {
        mediator.relay(this);
    }
}

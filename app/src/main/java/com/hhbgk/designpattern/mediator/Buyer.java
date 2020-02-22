package com.hhbgk.designpattern.mediator;

import android.util.Log;

/**
 * 具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，
 * 由中介者对象负责后续的交互。
 */
public class Buyer extends AbstractColleague {
    public Buyer(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void receive() {
        Log.i(tag, "Hi seller, I'm buyer");
    }

    @Override
    public void send() {
        mediator.relay(this);
    }
}

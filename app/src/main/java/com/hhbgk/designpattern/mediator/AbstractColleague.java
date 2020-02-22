package com.hhbgk.designpattern.mediator;

/**
 * 抽象同事类（Colleague）角色：定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，
 * 实现所有相互影响的同事类的公共功能
 */
public abstract class AbstractColleague {
    protected String tag = getClass().getSimpleName();
    protected IMediator mediator;

    public AbstractColleague(IMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();
    public abstract void send();
}

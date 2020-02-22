package com.hhbgk.designpattern.mediator;

/**
 * 抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法
 */
public interface IMediator {
    void register(AbstractColleague colleague);
    void relay(AbstractColleague colleague);
}

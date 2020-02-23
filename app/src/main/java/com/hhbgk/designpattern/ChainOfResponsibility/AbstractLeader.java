package com.hhbgk.designpattern.ChainOfResponsibility;

/**
 * 抽象处理者(Handler)角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接
 */
public abstract class AbstractLeader {
    String tag = getClass().getSimpleName();

    private AbstractLeader next;
    public AbstractLeader getNext() {
        return next;
    }

    public void setNext(AbstractLeader next) {
        this.next = next;
    }

    public abstract void handleRequest(int askForLeaveDays);
}

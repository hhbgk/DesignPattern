package com.hhbgk.designpattern.command;

/**
 * 具体命令角色角色：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作。
 */
public class NoodlesCommand implements IOrderCommand {

    private ICooker cooker;
    public NoodlesCommand() {
        cooker = new NoodlesCooker();
    }
    @Override
    public void execute() {
        cooker.cook();
    }
}

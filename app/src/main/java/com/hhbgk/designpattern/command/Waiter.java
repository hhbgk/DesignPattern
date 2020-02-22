package com.hhbgk.designpattern.command;

import android.util.Log;

import java.util.HashMap;

/**
 * 调用者角色：是请求的发送者，它通常拥有很多的命令对象，并通过访问命令对象来执行相关请求，它不直接访问接收者
 */
public class Waiter {
    private HashMap<String, IOrderCommand> commandList;

    public Waiter() {
        commandList = new HashMap<>();
    }

    public void addCommand(String order, IOrderCommand command) {
        commandList.put(order, command);
    }

    public void sendOrderCommand(String order) {
        IOrderCommand command = commandList.get(order);
        if (command != null) {
            command.execute();
        } else {
            Log.e(getClass().getSimpleName(), "No this dish!");
        }
    }
}

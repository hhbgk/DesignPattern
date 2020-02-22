package com.hhbgk.designpattern.command;

import android.util.Log;

/**
 * 实现者/接收者角色：执行命令功能的相关操作，是具体命令对象业务的真正实现者
 */
public class PancakesCooker implements ICooker{
    private String tag = getClass().getSimpleName();
    @Override
    public void cook() {
        Log.i(tag, "Cook pancakes...");
    }
}

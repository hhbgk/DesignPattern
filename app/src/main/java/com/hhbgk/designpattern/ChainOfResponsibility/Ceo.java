package com.hhbgk.designpattern.ChainOfResponsibility;

import android.util.Log;

/**
 * 具体处理者(Concrete Handler)角色：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，
 * 否则将该请求转给它的后继者
 */
public class Ceo extends AbstractLeader {
    @Override
    public void handleRequest(int askForLeaveDays) {
        if (askForLeaveDays > 7) {
            Log.i(tag, "CEO approves your leave for " + askForLeaveDays +" days");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(askForLeaveDays);
            } else {
                Log.i(tag, "CEO does not approves your leave.");
            }
        }
    }
}

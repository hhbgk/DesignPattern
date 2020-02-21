package com.hhbgk.designpattern.proxy.staticproxy;

import android.util.Log;

public class ThreadProxy implements IRunnable {
    private String tag = getClass().getSimpleName();
    private IRunnable thread;

    public ThreadProxy(IRunnable thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        Log.i(tag, "proxy running...");
        thread.run();
        Log.i(tag, "proxy stop...");
    }
}

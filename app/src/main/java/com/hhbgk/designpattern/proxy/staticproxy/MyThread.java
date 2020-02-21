package com.hhbgk.designpattern.proxy.staticproxy;

import android.util.Log;

public class MyThread implements IRunnable {
    @Override
    public void run() {
        Log.e(getClass().getSimpleName(), "function 'run()' is running...");
    }
}

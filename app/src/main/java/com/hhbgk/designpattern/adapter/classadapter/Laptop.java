package com.hhbgk.designpattern.adapter.classadapter;

import android.util.Log;

import com.hhbgk.designpattern.adapter.ITarget;

/**
 * 使用者类
 */
public class Laptop {
    String tag = getClass().getSimpleName();

    public void charging(ITarget target) {
        if (target.request() == 20) {
            Log.i(tag, "The voltage is fine");
        } else {
            throw new IllegalAccessError("The voltage not adapter!");
        }
    }
}

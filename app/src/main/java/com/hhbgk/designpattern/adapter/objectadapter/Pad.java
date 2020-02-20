package com.hhbgk.designpattern.adapter.objectadapter;

import android.util.Log;

import com.hhbgk.designpattern.adapter.ITarget;

/**
 * 使用者类
 */
public class Pad {
    String tag = getClass().getSimpleName();

    public void charging(ITarget target) {
        if (target.request() == 10) {
            Log.i(tag, "The voltage is fine");
        } else {
            throw new IllegalAccessError("The voltage not adapter!");
        }
    }
}

package com.hhbgk.designpattern.bridge;

import android.util.Log;

/**
 * 行为的具体实现类
 */
public class BenzBrand implements IBrand {
    private String tag = getClass().getSimpleName();
    @Override
    public void create() {
        Log.i(tag, "add Benz logo");
    }
}

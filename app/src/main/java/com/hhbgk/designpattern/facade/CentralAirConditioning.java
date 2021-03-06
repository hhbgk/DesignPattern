package com.hhbgk.designpattern.facade;

import android.util.Log;

/**
 * 子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它
 */
public class CentralAirConditioning implements IController {
    private String tag = getClass().getSimpleName();

    @Override
    public void on() {
        Log.i(tag, "Central Air-Conditioning on");
    }

    @Override
    public void off() {
        Log.i(tag, "Central Air-Conditioning off");
    }
}

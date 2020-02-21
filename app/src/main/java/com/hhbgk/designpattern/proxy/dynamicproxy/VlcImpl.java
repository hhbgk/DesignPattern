package com.hhbgk.designpattern.proxy.dynamicproxy;

import android.util.Log;

public class VlcImpl implements IPlayer {
    @Override
    public void play(int time) {
        Log.e(getClass().getSimpleName(), "function 'play()' is running...");
    }
}

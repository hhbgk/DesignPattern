package com.hhbgk.designpattern.proxy.dynamicproxy;

import android.util.Log;

public class VlcImpl implements IPlayer {
    @Override
    public String selectFile() {
        return "/user/video/myVideo.mp4";
    }

    @Override
    public void play() {
        Log.e(getClass().getSimpleName(), "function 'play()' is running...");
    }

    @Override
    public void pause() {
        Log.e(getClass().getSimpleName(), "function 'pause()' is running...");
    }

    @Override
    public void seek(long time) {
        Log.e(getClass().getSimpleName(), "seek:" + time);
    }

    @Override
    public void stop() {
        Log.e(getClass().getSimpleName(), "function 'stop()' is running...");
    }
}

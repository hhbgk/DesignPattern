package com.hhbgk.designpattern.factory.staticfactorymethod.android;

import android.util.Log;

public final class PngStream implements IOStream {
    String tag = getClass().getSimpleName();
    @Override
    public void write(byte[] data) {
        Log.w(tag, "Write to png file");
    }

    @Override
    public byte[] read() {
        return new byte[0];
    }

    @Override
    public long size() {
        return 0;
    }
}

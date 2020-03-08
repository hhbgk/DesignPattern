package com.hhbgk.designpattern.factory.staticfactorymethod.android;

public interface IOStream {
    void write(byte[] data);
    byte[] read();
    long size();
}

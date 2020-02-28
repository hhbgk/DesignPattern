package com.hhbgk.designpattern.proxy.dynamicproxy;

public interface IPlayer {
    String selectFile();
    void play();
    void pause();
    void seek(long time);
    void stop();
}

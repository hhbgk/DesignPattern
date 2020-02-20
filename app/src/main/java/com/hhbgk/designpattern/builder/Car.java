package com.hhbgk.designpattern.builder;

import androidx.annotation.NonNull;

/**
 * 具体产品类
 */
public final class Car {
    private String frame;

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    private String tires;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    private String engine;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    @NonNull
    @Override
    public String toString() {
        return "frame:" + frame+",tires:"+tires+",engine:"+engine;
    }
}

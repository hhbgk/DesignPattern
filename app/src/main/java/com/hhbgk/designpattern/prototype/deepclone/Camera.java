package com.hhbgk.designpattern.prototype.deepclone;

import androidx.annotation.NonNull;

public class Camera implements Cloneable {

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;


    @NonNull
    @Override
    public String toString() {
        return "number:"+number;
    }

    @NonNull
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

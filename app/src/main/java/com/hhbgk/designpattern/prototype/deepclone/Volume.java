package com.hhbgk.designpattern.prototype.deepclone;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Volume implements Serializable {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    @NonNull
    @Override
    public String toString() {
        return "number:"+number;
    }
}

package com.hhbgk.designpattern.prototype.lightclone;

import androidx.annotation.NonNull;

public class Sheep implements Cloneable {
    public Sheep(String name) {
        this.name = name;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return "name:" + name;
    }

    @NonNull
    @Override
    public Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}

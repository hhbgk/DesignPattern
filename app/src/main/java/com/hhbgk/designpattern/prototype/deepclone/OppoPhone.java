package com.hhbgk.designpattern.prototype.deepclone;

import androidx.annotation.NonNull;

/**
 * 深拷贝之方式一:重写了clone()方法使用父类的clone()方法实现深克隆
 */
public class OppoPhone implements Cloneable {
    private String name;
    private Camera camera;

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public OppoPhone(String name, Camera camera) {
        this.name = name;
        this.camera = camera;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return "name:" + name + "," + camera.toString();
    }

    @NonNull
    @Override
    public Object clone() {
        OppoPhone oppoPhone = null;
        try {
            oppoPhone = (OppoPhone) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        oppoPhone.name = this.name;
        try {
            oppoPhone.camera = (Camera) this.camera.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return oppoPhone;
    }
}
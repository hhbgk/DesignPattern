package com.hhbgk.designpattern.adapter.classadapter;

import com.hhbgk.designpattern.adapter.Adaptee;
import com.hhbgk.designpattern.adapter.ITarget;

/**
 * 适配者类
 */
public class LaptopAdapter extends Adaptee implements ITarget {

    @Override
    public int request() {
        return output220V() / 11;
    }
}

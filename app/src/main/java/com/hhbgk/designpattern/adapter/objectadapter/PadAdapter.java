package com.hhbgk.designpattern.adapter.objectadapter;

import com.hhbgk.designpattern.adapter.Adaptee;
import com.hhbgk.designpattern.adapter.ITarget;

public class PadAdapter implements ITarget {
    private Adaptee adaptee;

    public PadAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int request() {
        return adaptee.output220V() / 22;
    }
}

package com.hhbgk.designpattern.factory.factorymethod;

import android.util.Log;

/**
 * 具体的产品类
 */
public class XiaomiGreenPhone extends AbstractPhone {

    public XiaomiGreenPhone() {
        super("XiaomiGreenPhone");
    }

    public XiaomiGreenPhone(String name) {
        super(name);
    }

    @Override
    public void design() {
        Log.i(tag, "Design 4.0 inch xiaomi green phone");
    }
}

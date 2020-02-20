package com.hhbgk.designpattern.factory.factorymethod;

import android.util.Log;

/**
 * 具体的产品类
 */
public class XiaomiGreyPhone extends AbstractPhone {
    public XiaomiGreyPhone(String name) {
        super(name);
    }

    @Override
    public void design() {
        Log.i(tag, "Design 5.4 inch xiaomi grey phone");
    }
}

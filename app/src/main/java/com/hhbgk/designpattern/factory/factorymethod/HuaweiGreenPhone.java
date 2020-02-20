package com.hhbgk.designpattern.factory.factorymethod;

import android.util.Log;

/**
 * 具体的产品类
 */
public class HuaweiGreenPhone extends AbstractPhone {
    public HuaweiGreenPhone(String name) {
        super(name);
    }

    @Override
    public void design() {
        Log.i(tag, "Design 4.3 inch huawei green phone");
    }
}

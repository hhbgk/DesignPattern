package com.hhbgk.designpattern.factory.factorymethod;

import android.util.Log;

/**
 * 具体的产品类
 */
public class HuaweiGreyPhone extends AbstractPhone {
    public HuaweiGreyPhone() {
        super("HuaweiGreyPhone");
    }
    public HuaweiGreyPhone(String name) {
        super(name);
    }

    @Override
    public void design() {
        Log.i(tag, "Design 5.1 inch huawei grey phone");
    }
}

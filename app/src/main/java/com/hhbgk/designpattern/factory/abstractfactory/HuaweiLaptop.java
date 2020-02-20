package com.hhbgk.designpattern.factory.abstractfactory;

import android.util.Log;

public class HuaweiLaptop implements ILaptop {
    String tag = getClass().getSimpleName();

    @Override
    public void assembly() {
        Log.i(tag, "assembly Huawei Laptop");
    }
}

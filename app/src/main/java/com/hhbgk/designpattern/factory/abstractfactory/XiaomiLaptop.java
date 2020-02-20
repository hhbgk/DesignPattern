package com.hhbgk.designpattern.factory.abstractfactory;

import android.util.Log;

public class XiaomiLaptop implements ILaptop {
    String tag = getClass().getSimpleName();

    @Override
    public void assembly() {
        Log.i(tag, "assembly Xiaomi Laptop");
    }
}

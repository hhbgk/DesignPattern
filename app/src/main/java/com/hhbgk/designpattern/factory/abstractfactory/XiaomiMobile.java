package com.hhbgk.designpattern.factory.abstractfactory;

import android.util.Log;

public class XiaomiMobile implements IMobile {
    String tag = getClass().getSimpleName();
    @Override
    public void design() {
        Log.i(tag, "design Xiaomi Mobile");
    }
}

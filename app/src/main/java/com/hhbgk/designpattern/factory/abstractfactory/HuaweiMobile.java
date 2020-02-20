package com.hhbgk.designpattern.factory.abstractfactory;

import android.util.Log;

public class HuaweiMobile implements IMobile {
    String tag = getClass().getSimpleName();
    @Override
    public void design() {
        Log.i(tag, "Design Huawei Mobile");
    }
}

package com.hhbgk.designpattern.factory.staticfactorymethod;

import android.util.Log;

public class BlackPhone extends AbstractPhone {
    @Override
    public void design() {
        Log.i(tag, "Design phone 5 inch shape");
    }
}

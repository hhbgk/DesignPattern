package com.hhbgk.designpattern.templatemethod;

import android.util.Log;

/**
 * 具体子类：实现抽象类中所定义的抽象方法和钩子方法
 */
public class Parsley extends AbstractCooking {

    public Parsley() {
        Log.i(tag, "====cook parsley====");
    }

    @Override
    public void addVegetable() {
        Log.w(tag, "add parsley...");
    }
}

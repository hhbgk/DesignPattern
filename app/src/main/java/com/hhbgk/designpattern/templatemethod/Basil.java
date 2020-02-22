package com.hhbgk.designpattern.templatemethod;

import android.util.Log;

/**
 * 具体子类：实现抽象类中所定义的抽象方法和钩子方法
 */
public class Basil extends AbstractCooking {

    public Basil() {
        Log.i(tag, "====cook basil====");
    }
    @Override
    public void addVegetable() {
        Log.w(tag, "add basil...");
    }
}

package com.hhbgk.designpattern.templatemethod;

import android.util.Log;

/**
 * 抽象类：负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成
 */
public abstract class AbstractCooking {
    String tag = getClass().getSimpleName();
    public final void cookVegetable() {
        addOil();
        addSalt();
        addVegetable();
        addSeasoning();
        fry();
    }

    private void addOil() {
        Log.i(tag, "add some oil...");
    }

    private void addSalt() {
        Log.i(tag, "add some salt...");
    }

    public abstract void addVegetable();

    private void addSeasoning() {
        Log.i(tag, "add some seasoning...");
    }

    private void fry() {
        Log.i(tag, "fry vegetable...");
    }
}

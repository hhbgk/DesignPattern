package com.hhbgk.designpattern.bridge;

import android.util.Log;

/**
 * 是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 */
public class BClass extends CarClass {

    public BClass(IBrand brand) {
        super(brand);
    }

    @Override
    public void createCarClass() {
        Log.i(tag, "create B-class car");
        brand.create();
    }
}

package com.hhbgk.designpattern.factory.abstractfactory;

public class HuaweiFactory implements IBrandFactory {
    @Override
    public ILaptop createLaptop() {
        return new HuaweiLaptop();
    }

    @Override
    public IMobile createMobile() {
        return new HuaweiMobile();
    }
}

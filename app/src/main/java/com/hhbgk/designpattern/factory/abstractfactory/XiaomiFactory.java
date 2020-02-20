package com.hhbgk.designpattern.factory.abstractfactory;

public class XiaomiFactory implements IBrandFactory {

    @Override
    public ILaptop createLaptop() {
        return null;
    }

    @Override
    public IMobile createMobile() {
        return null;
    }

}

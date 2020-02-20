package com.hhbgk.designpattern.factory.staticfactorymethod;

public class PhoneFactory {

    public static AbstractPhone createPhone(String type) {
        AbstractPhone phone = null;
        switch (type) {
            case "black":
                phone = new BlackPhone();
                break;
            case "red":
                phone = new RedPhone();
                break;
            default:
                break;
        }
        return phone;
    }
}

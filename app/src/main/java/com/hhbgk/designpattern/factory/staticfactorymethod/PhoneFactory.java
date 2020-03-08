package com.hhbgk.designpattern.factory.staticfactorymethod;

public class PhoneFactory extends AbstractFactory {

    //方式1
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

    //方式2
    @Override
    public <T extends AbstractPhone> T createPhone(Class<T> c) {
        AbstractPhone phone = null;
        try {
            phone = (AbstractPhone) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) phone;
    }
}

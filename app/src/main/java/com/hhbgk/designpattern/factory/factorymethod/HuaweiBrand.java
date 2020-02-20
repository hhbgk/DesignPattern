package com.hhbgk.designpattern.factory.factorymethod;

/**
 * 具体的工厂方法类
 */
public class HuaweiBrand extends AbstractBrandFactory {

    @Override
    public AbstractPhone createPhone(String color) {
        AbstractPhone phone = null;
        switch (color) {
            case "green":
                phone = new HuaweiGreenPhone("HuaweiGreenPhone");
                break;
            case "grey":
                phone = new HuaweiGreyPhone("HuaweiGreyPhone");
                break;
        }

        return phone;
    }
}

package com.hhbgk.designpattern.factory.factorymethod;

/**
 * 具体的工厂方法类
 */
public class XiaomiBrand extends AbstractBrandFactory {

    @Override
    public AbstractPhone createPhone(String color) {
        AbstractPhone phone = null;

        switch (color) {
            case "green":
                phone = new XiaomiGreenPhone("XiaomiGreenPhone");
                break;
            case "grey":
                phone = new XiaomiGreyPhone("XiaomiGreyPhone");
                break;
        }
        return phone;
    }
}

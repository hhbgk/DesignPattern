package com.hhbgk.designpattern.factory.factorymethod;

/**
 * 具体的工厂方法类
 */
public class HuaweiBrandFactory extends AbstractBrandFactory {

    @Override
    public AbstractPhone createPhone(String color) {
        AbstractPhone phone = null;
        switch (color) {
            case "green":
//                phone = new HuaweiGreenPhone("HuaweiGreenPhone");
                break;
            case "grey":
                phone = new HuaweiGreyPhone("HuaweiGreyPhone");
                break;
        }

        return phone;
    }

    @Override
    public <T extends AbstractPhone> T createPhone(Class<T> claz) {
        AbstractPhone phone = null;
        try {
            phone = (AbstractPhone) Class.forName(claz.getName()).newInstance();
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

package com.hhbgk.designpattern.factory.staticfactorymethod.android;

public final class IOFactory {
    public static <T extends IOStream> T createIOStream(Class<T> claz) {
        IOStream stream = null;
        try {
            stream = (IOStream) Class.forName(claz.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) stream;
    }
}

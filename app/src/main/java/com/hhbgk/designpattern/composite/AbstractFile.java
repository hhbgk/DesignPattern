package com.hhbgk.designpattern.composite;

/**
 * 抽象构件,可以是接口或抽象类
 */
public abstract class AbstractFile {
    String tag = getClass().getSimpleName();
    String filename;

    protected void add(AbstractFile file) {
        throw new UnsupportedOperationException();
    }

    protected void remove(AbstractFile file) {
        throw new UnsupportedOperationException();
    }

    protected abstract void show();
}

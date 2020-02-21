package com.hhbgk.designpattern.composite;

import android.util.Log;

/**
 * 叶子构件,它在组合结构中表示叶子节点对象
 */
public class Document extends AbstractFile {

    public Document (String filename) {
        this.filename = filename;
    }

    @Override
    protected void show() {
        Log.i(tag,  filename);
    }
}

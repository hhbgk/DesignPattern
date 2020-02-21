package com.hhbgk.designpattern.composite;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件,在组合结构中表示容器节点对象，容器节点包含子节点
 */
public class DocumentFolder extends AbstractFile {
    private List<AbstractFile> list = new ArrayList<>();

    public DocumentFolder(String filename) {
        this.filename = filename;
    }

    @Override
    public void add(AbstractFile file) {
        list.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        list.remove(file);
    }

    @Override
    public void show() {
        Log.w(tag, "-------" + filename +"------ include:");
        for (AbstractFile file : list) {
            file.show();
        }
    }
}

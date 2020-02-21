package com.hhbgk.designpattern.composite;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MyFiles extends AbstractFile {
    private List<AbstractFile> list = new ArrayList<>();

    public MyFiles(String filename) {
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
        Log.e(tag, "-------" + filename +"------ include:");
        for (AbstractFile file : list) {
            file.show();
        }
    }
}

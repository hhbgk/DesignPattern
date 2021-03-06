package com.hhbgk.designpattern.visitor;

import android.util.Log;

/**
 * 具体的访问者，它需要给出对每一个元素类访问时所产生的具体行为
 */
public class CtoVisitor implements IVisitor {
    private String tag = getClass().getSimpleName();

    @Override
    public void visit(EngineerElement element) {
        Log.w(tag, "Engineer:" + element.getName() + ", Code lines:" + element.getCodeLines());
    }

    @Override
    public void visit(ManagerElement element) {
        Log.w(tag, "Manager:" + element.getName() +", Projects:" + element.getProjects());
    }
}

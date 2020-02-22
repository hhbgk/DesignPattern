package com.hhbgk.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理者(Caretaker)角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 */
public class Caretaker {
    private List<Memento> list;

    public Caretaker() {
        list = new ArrayList<>();
    }

    public void add(Memento memento) {
        list.add(memento);
    }

    public Memento getMemento(int index) {
        return list.get(index);
    }
}

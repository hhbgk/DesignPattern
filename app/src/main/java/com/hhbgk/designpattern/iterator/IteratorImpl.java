package com.hhbgk.designpattern.iterator;

import java.util.List;

/**
 * 具体迭代器角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 * @param <E>
 */
public class IteratorImpl <E> implements IIterator<E> {

    private List<E> list;
    private int index = -1;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() -1) {
            return true;
        }
        return false;
    }

    @Override
    public E next() {
        return list.get(++index);
    }
}

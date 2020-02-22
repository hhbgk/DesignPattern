package com.hhbgk.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *具体聚合角色：实现抽象聚合类，返回一个具体迭代器的实例。
 * @param <E>
 */
public class AggregateImpl<E> implements IAggregate<E> {
    private List<E> list;

    public AggregateImpl() {
        list = new ArrayList<>();
    }

    @Override
    public void add(E e) {
        if (e != null) {
            list.add(e);
        }
    }

    @Override
    public void remove(E e) {
        if (e != null) {
            list.remove(e);
        }
    }

    @Override
    public IIterator<E> getIterator() {
        return new IteratorImpl<>(list);
    }
}

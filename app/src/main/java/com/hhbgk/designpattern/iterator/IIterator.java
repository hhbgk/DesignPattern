package com.hhbgk.designpattern.iterator;

/**
 * 抽象迭代器角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法。
 * @param <E>
 */
public interface IIterator<E> {
    boolean hasNext();
    E next();
}

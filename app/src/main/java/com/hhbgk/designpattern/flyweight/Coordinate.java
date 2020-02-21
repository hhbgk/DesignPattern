package com.hhbgk.designpattern.flyweight;

/**
 * 非享元角色：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中
 */
public class Coordinate {
    public Coordinate(){}
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int x;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int y;
}

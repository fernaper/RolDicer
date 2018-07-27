/**
 *        -  -  -  -  RolDicer  -  -  -  -
 *
 *  I am not responsible for the problems that this program may cause.
 *
 *      @author Fernando Pérez Gutiérrez fernaperg@gmail.com
 *
 *  For more visit: https://github.com/fernaper
 *  Full project: https://github.com/fernaper/RolDicer
 *
 *  2018 (c) fernaperg
 *
 */
package com.roldicer.model.items;

/**
 *
 * @author Fernando Pérez Gutiérrez <fernaperg@gmail.com>
 */
public abstract class Item {

    private int x;
    private int y;
    private int width;
    private int height;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract void performAction();

    public abstract void destroy();
}

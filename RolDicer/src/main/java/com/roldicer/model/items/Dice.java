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

import java.awt.Dimension;

/**
 *
 * @author Fernando Pérez Gutiérrez <fernaperg@gmail.com>
 */
public class Dice extends Item {
    
    private boolean editable;
    
    public Dice() {
        this.editable = true;
        this.position = new Dimension(0,0);
        this.size = new Dimension(20,20);
    }
    
    public Dice(Dimension position, Dimension size) {
        this.position = position;
        this.size = size;
    }

    @Override
    public void performAction() {
        if (this.editable) {
            
        }
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

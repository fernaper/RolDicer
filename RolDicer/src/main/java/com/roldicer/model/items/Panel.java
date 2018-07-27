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

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando Pérez Gutiérrez <fernaperg@gmail.com>
 */
public class Panel extends Item{
    private List<Item> items;
    
    public Panel() {
        this.items = new ArrayList();
    }

    @Override
    public void performAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

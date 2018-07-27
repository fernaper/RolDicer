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

import com.roldicer.view.Generator;
import javax.swing.JButton;

/**
 *
 * @author Fernando Pérez Gutiérrez <fernaperg@gmail.com>
 */
public class Dice extends Item {
    
    private JButton button;
    private boolean editable;
    
    public Dice() {
        this.editable = true;
        this.button = Generator.button();
        this.button.addActionListener((java.awt.event.ActionEvent evt) -> {
           performAction(); 
        });
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

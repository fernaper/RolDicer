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
package com.roldicer.view;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Fernando Pérez Gutiérrez <fernaperg@gmail.com>
 */
public class Generator {

    private static final Dimension dimButton = new Dimension(20, 20);

    public static JButton button() {
        JButton button = new JButton();
        button.setIcon(new ImageIcon(Generator.class.getResource("/images/button.png")));
        button.setBorder(null);
        button.setContentAreaFilled(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        return button;
    }

    public static Dimension dimButton() {
        return dimButton;
    }
}

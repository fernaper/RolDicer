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
package com.roldicer.controller;

import com.roldicer.view.NewTemplate;
import com.roldicer.view.Window;
import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 *
 * @author Fernando Pérez Gutiérrez <fernaperg@gmail.com>
 */
public class Controller {

    public static final String TITLE = "RolDicer";
    private Window window;
    private NewTemplate newTemplate;

    public Controller() {

    }

    public static ResourceBundle readBundle(String lang) {
        FileInputStream fis;
        try {
            fis = new FileInputStream("src/main/resources/idioms/" + lang + ".properties");
        } catch (FileNotFoundException ex) {
            return null;
        }

        ResourceBundle bundle;
        try {
            bundle = new PropertyResourceBundle(fis);
        } catch (IOException ex) {
            return null;
        }

        return bundle;
    }

    public void setWindow(Window window) {
        this.window = window;
        this.window.setMinimumSize(new Dimension(300, 300));
        this.window.setVisible(true);
        this.window.setLocationRelativeTo(null);
    }

    public void clearView() {
        if (this.window != null) {
            this.window.dispose();
        }
        this.window = null;
    }

    public void setNewTemplate(NewTemplate newTemplate) {
        this.newTemplate = newTemplate;
        this.newTemplate.setMinimumSize(new Dimension(800, 500));
        this.newTemplate.setVisible(true);
        this.newTemplate.setLocationRelativeTo(null);
    }

}

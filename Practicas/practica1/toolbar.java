package practica1;

import java.awt.Color.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class toolbar {

    public static JMenuBar toolbarP1() {

        JMenuBar toolbar = new JMenuBar();
        toolbar.setOpaque(true);
        toolbar.setBackground(new Color(74, 167, 255));
        toolbar.setPreferredSize(new Dimension(10, 20));
        return toolbar;
    }

}
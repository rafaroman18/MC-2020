package practica1;

import java.awt.Color.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class practica1 {
    
    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);

        //Con estas 
        Toolkit screen = Toolkit.getDefaultToolkit();
		Dimension tamscreen = screen.getScreenSize();
		int heightscreen = tamscreen.height;
        int widthscreen = tamscreen.width;

        //Creamos el frame inicial
        JFrame frame = new JFrame("Practica1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLocation(widthscreen/4,heightscreen/4);       

        //Toolbar
        JMenuBar toolbar = new JMenuBar();
		toolbar.setOpaque(true);
		toolbar.setBackground(new Color(77, 195, 255));
        toolbar.setPreferredSize(new Dimension(10,20));

        JDesktopPane desktop = new JDesktopPane();

		JInternalFrame ey = new JInternalFrame (("Gráfica"),true,false,true,true);
        ey.setBackground(Color.CYAN);

		JInternalFrame ey2 = new JInternalFrame (("Gráfica"),true,false,true,true);
        ey2.setBackground(Color.GREEN);
        ey2.setVisible(true);

        desktop.add(ey);
        desktop.add(ey2);

        //Añadimos todos los elementos
        frame.getContentPane().add(desktop);
        frame.setJMenuBar(toolbar);


        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
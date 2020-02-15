package practica1;

import javax.swing.*;
import java.awt.*;

public class practica1 {

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);

        // Con estas líneas averiguamos la medida de la pantalla
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension tamscreen = screen.getScreenSize();
        int heightscreen = tamscreen.height;
        int widthscreen = tamscreen.width;

        // Creamos un marco
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MC - Practica 1");

        // Creamos barra de herramientas
        JMenuBar tbar = toolbar.create();

        // Grafica
        JInternalFrame framegraph = new JInternalFrame(("Simuladores"), true, false, true, true);
        framegraph.setSize(widthscreen/4, widthscreen/4);
        framegraph.setLocation(0, 0);
        framegraph.setVisible(true);

        Canvas grafica = new Canvas();
        grafica.setBackground(Color.BLACK);
        grafica.setFocusable(true);

        // Añadimos los componentes
        framegraph.add(grafica);
        frame.add(framegraph);
        frame.setJMenuBar(tbar);

        // Fijamos el marco a un tamaño variable en cuanto al tamaño de la pantalla
        frame.setSize(widthscreen / 2, widthscreen / 4);
        frame.setLocation(heightscreen / 2, widthscreen / 8);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    

    // // // // // *

    // // // // // *

    // // // // // *
    // // // // // * //###### GRAFICOS ###### JInternalFrame intgrafica = new
    // JInternalFrame
    // // // // // * (("Gráfica"),true,false,true,true); intgrafica.add(grafica);
    // // // // // * intgrafica.setSize(800,800); intgrafica.setVisible(true);
    // // // // // *
    // // // // // * JDesktopPane desktop = new JDesktopPane();
    // desktop.add(intgrafica);
    // // // // // *
    // // // // // * /*JInternalFrame ey = new JInternalFrame
    // (("Gráfica"),true,false,true,true);
    // // // // // * ey.setBackground(Color.CYAN);
    // // // // // *
    // // // // // * JInternalFrame ey2 = new JInternalFrame
    // (("Gráfica"),true,false,true,true);
    // // // // // * ey2.setBackground(Color.GREEN); ey2.setVisible(true);
    // // // // // *
    // // // // // * desktop.add(ey); desktop.add(ey2);
    // // // // // *
    // // // // // * //Añadimos todos los elementos
    // frame.getContentPane().add(desktop);
    // // // // // *
    // // // // // * frame.setJMenuBar(toolbar);
    // // // // // *
    // // // // // * //Display the window. frame.pack(); frame.setVisible(true);
    // // // // // *
    // // // // // * }
    // // // // // */

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
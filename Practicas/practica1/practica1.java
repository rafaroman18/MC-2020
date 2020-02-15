package practica1;

import javax.swing.*;
import java.awt.*;

public class practica1 {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

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

        // Fijamos el marco a un tamaño variable en cuanto al tamaño de la pantalla
        frame.setSize(widthscreen / 2, widthscreen / 4 + 50);
        frame.setLocation(heightscreen / 2, widthscreen / 8);
        frame.setLayout(null);
        frame.setVisible(true);

        // Creamos barra de herramientas
        JMenuBar tbar = toolbar.create(frame);

        // Creamos la grafica
        JInternalFrame graph = graphic.create(widthscreen);
        
        // Creamos la botonera
        JInternalFrame but = buttons.create(frame, widthscreen);

        //Creamos los simuladores
        JInternalFrame sim = simulator.create(widthscreen);

        // Añadimos los componentes
        frame.add(graph);
        frame.add(but);
        frame.add(sim);
        frame.setJMenuBar(tbar);
    
    }
    
}
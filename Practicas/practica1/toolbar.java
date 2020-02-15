package practica1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class toolbar {

    public static JMenuBar create() {

        // Creamos la barra
        JMenuBar toolbar = new JMenuBar();
        toolbar.setOpaque(true);
        toolbar.setBackground(new Color(74, 167, 255));
        toolbar.setPreferredSize(new Dimension(10, 20));

        //Creamos los botones de la barra
        JMenu archivo = new JMenu("Archivo");
        JMenu editar = new JMenu("Editar");

        //Tras eso, creamos los items (dentro de cada boton de la barra)
        JMenuItem archivo1 = new JMenuItem("Abrir", KeyEvent.VK_1);
        archivo1.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Abrir");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Abrir");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(toolbar);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
        });

        JMenuItem archivo2 = new JMenuItem("Guardar", KeyEvent.VK_2);
        archivo2.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Guardar");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Guardar");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(toolbar);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
        });


        JMenuItem archivo3 = new JMenuItem("Guardar como...", KeyEvent.VK_3);
        archivo3.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Guardar como...");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Guardar como...");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(toolbar);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
        });


        JMenuItem editar1 = new JMenuItem("Preferencias", KeyEvent.VK_P);
        editar1.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Preferencias");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Preferencias");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(toolbar);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
        });


        JMenuItem editar2 = new JMenuItem("Deshacer", KeyEvent.VK_A);
        editar2.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Deshacer");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Deshacer");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(toolbar);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
        });

        JMenuItem editar3 = new JMenuItem("Rehacer", KeyEvent.VK_R);
        editar3.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Rehacer");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Rehacer");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(toolbar);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
        });


        // Añadimos los componentes
        archivo.add(archivo1);
        archivo.add(archivo2);
        archivo.add(archivo3);

        editar.add(editar1);
        editar.add(editar2);
        editar.add(editar3);

        toolbar.add(archivo);
        toolbar.add(editar);

        return toolbar;
    }

}
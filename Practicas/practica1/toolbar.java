package practica1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class toolbar {

    public static JMenuBar create(JFrame frame) {

        // Creamos la barra
        JMenuBar toolbar = new JMenuBar();
        toolbar.setOpaque(true);
        toolbar.setBackground(new Color(74, 167, 255));
        toolbar.setPreferredSize(new Dimension(10, 20));

        //Creamos los botones de la barra
        JMenu archivo = new JMenu("Archivo");
        JMenu editar = new JMenu("Editar");

        //Tras eso, creamos los items (dentro de cada boton de la barra)
        JMenu abrir = new JMenu("Abrir");
		
		JMenuItem archivo1 = new JMenuItem("Archivo 1", KeyEvent.VK_1);
        archivo1.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Archivo 1");
			JLabel l = new JLabel("Archivo 1");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
		});
		
		JMenuItem archivo2 = new JMenuItem("Archivo 2", KeyEvent.VK_2);
        archivo2.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Archivo 2");
			JLabel l = new JLabel("Archivo 2");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
		});
		
		JMenuItem archivo3 = new JMenuItem("Archivo 3", KeyEvent.VK_3);
        archivo3.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Archivo 3");
			JLabel l = new JLabel("Archivo 3");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
        });

        JMenuItem guardar = new JMenuItem("Guardar", KeyEvent.VK_G);
        guardar.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Guardar");
			JLabel l = new JLabel("Guardar");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
        });


        JMenuItem guardarcomo = new JMenuItem("Guardar como...", KeyEvent.VK_C);
        guardarcomo.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Guardar como...");
			JLabel l = new JLabel("Guardar como...");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
        });


        JMenuItem preferencias = new JMenuItem("Preferencias", KeyEvent.VK_P);
        preferencias.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Preferencias");
			JLabel l = new JLabel("Preferencias");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
        });


        JMenuItem deshacer = new JMenuItem("Deshacer", KeyEvent.VK_D);
        deshacer.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Deshacer");
			JLabel l = new JLabel("Deshacer");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
        });

        JMenuItem rehacer = new JMenuItem("Rehacer", KeyEvent.VK_R);
        rehacer.addActionListener((ActionEvent e) -> {
            JFrame x = new JFrame("Rehacer");
			JLabel l = new JLabel("Rehacer");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
        });


		// Añadimos los componentes
		abrir.add(archivo1);
		abrir.add(archivo2);
		abrir.add(archivo3);

        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(guardarcomo);

        editar.add(preferencias);
        editar.add(deshacer);
        editar.add(rehacer);

        toolbar.add(archivo);
        toolbar.add(editar);

        return toolbar;
    }

}
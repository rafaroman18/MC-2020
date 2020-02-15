package practica1;

import javax.swing.*;
import java.awt.event.*;

public class buttons {
    public static JInternalFrame create(JFrame frame, int widthscreen){

        // Creamos la botonera y le asignamos un cierto tamaño
        JInternalFrame botonera = new JInternalFrame (("Botonera"),false, false, false, false);
        botonera.setSize(widthscreen/4 - 10,widthscreen/16);
		botonera.setLocation(widthscreen/4,0);
        botonera.setVisible(true);

        JPanel grafica2 = new JPanel();
		
		//Ayuda
		JButton ayuda = new JButton("Ayuda");
		ayuda.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Ayuda");
			JLabel l = new JLabel("Ayuda");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
			});
		
		//Acerca de
		JButton acerca = new JButton("Acerca De");
		acerca.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Acerca De");
			JLabel l = new JLabel("Acerca De");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
			});

		//Parámetros
		JTextField parametros = new JTextField("Parametros",10);

		//Mostar Parámetros
		JButton para = new JButton("Mostrar Parametros");
		para.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Mostrar Parametros");
			JLabel l = new JLabel(parametros.getText());
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
			});

		//1
		JButton uno = new JButton("1");
		uno.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("1");
			JLabel l = new JLabel("1");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
			});

		//2
		JButton dos = new JButton("2");
		dos.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("2");
			JLabel l = new JLabel("2");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
			});

		//3
		JButton tres = new JButton("3");
		tres.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("3");
			JLabel l = new JLabel("3");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(frame);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
			x.add(l);
			});


		grafica2.add(parametros);
		grafica2.add(para);
		grafica2.add(ayuda);
		grafica2.add(acerca);
		grafica2.add(uno);
		grafica2.add(dos);
		grafica2.add(tres);

    
		botonera.add(grafica2);
        
        return botonera;
    }
}
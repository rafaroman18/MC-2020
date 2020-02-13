
import java.awt.Color.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreandoMarcos{
	public static void main(String[] args){
		Marco marco1 = new Marco();

		marco1.setVisible(true);

		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}


class Marco extends JFrame
{
	public Marco(){

		JFrame.setDefaultLookAndFeelDecorated(true);
		JDesktopPane desktop = new JDesktopPane();
		getContentPane().add(desktop);
		//Párámetros para que el programa en el centro de la pantalla
		Toolkit screen = Toolkit.getDefaultToolkit();
		Dimension tamscreen = screen.getScreenSize();
		int heightscreen = tamscreen.height;
		int widthscreen = tamscreen.width;

		//El tamaño será la mitad del ancho y alto de nuestra pantalla
		setSize(widthscreen/2,heightscreen/2 + 20);


		//Además la ventana aparecerá en el centro de nuestra pantalla
		setLocation(widthscreen/4,heightscreen/4);

		//Título de la ventana
		setTitle("Práctica 1");


		//añadimos panel para las gráficas, botoneras y simulaci
		Canvas grafica = new Canvas();
		grafica.setBackground(Color.BLACK);
		grafica.setFocusable(true);


		//###### GRAFICOS ######		
		JInternalFrame intgrafica = new JInternalFrame (("Gráfica"),true,false,true,true);
		intgrafica.add(grafica);
		intgrafica.setSize(400,heightscreen/2 -30);
		intgrafica.setVisible(true);
		
		//###### BOTONERA ######
		JInternalFrame intgrafica2 = new JInternalFrame (("Botonera"),true,false,true,true);
		JPanel grafica2 = new JPanel();
		
		//Ayuda
		JButton ayuda = new JButton("Ayuda");
		ayuda.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Ayuda");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Ayuda");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(intgrafica2);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});
		
		//Acerca de
		JButton acerca = new JButton("Acerca De");
		acerca.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Acerca De");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Acerca De");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(intgrafica2);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});

		//Parámetros
		JTextField parametros = new JTextField("Parametros",10);

		//Mostar Parámetros
		JButton para = new JButton("Mostrar Parámetros");
		para.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Mostrar Parámetros");
			JPanel y = new JPanel();
			JLabel l = new JLabel(parametros.getText());
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(intgrafica2);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});

		//1
		JButton uno = new JButton("1");
		uno.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("1");
			JPanel y = new JPanel();
			JLabel l = new JLabel("1");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(intgrafica2);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});

		//2
		JButton dos = new JButton("2");
		dos.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("2");
			JPanel y = new JPanel();
			JLabel l = new JLabel("2");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(intgrafica2);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});

		//3
		JButton tres = new JButton("3");
		tres.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("3");
			JPanel y = new JPanel();
			JLabel l = new JLabel("3");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(intgrafica2);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});


		grafica2.add(acerca);
		grafica2.add(parametros);
		grafica2.add(ayuda);
		grafica2.add(para);
		grafica2.add(uno);
		grafica2.add(dos);
		grafica2.add(tres);


		intgrafica2.add(grafica2);
		intgrafica2.setSize(283,160);
		intgrafica2.setLocation(400,0);
		intgrafica2.setVisible(true);

		//##### SIMULADORES ######
		JInternalFrame intgrafica3 = new JInternalFrame (("Simuladores"),true,false,true,true);
		intgrafica3.setSize(283,194);
		intgrafica3.setLocation(400,160);
		intgrafica3.setVisible(true);

		Canvas simulador = new Canvas();
		simulador.setBackground(Color.BLACK);
		simulador.setFocusable(true);

		intgrafica3.add(simulador);
		desktop.add(intgrafica);
		desktop.add(intgrafica2);
		desktop.add(intgrafica3);

		//###### BARRA DE MENÚ #####
		JMenuBar blackmenu = new JMenuBar();
		blackmenu.setOpaque(true);
		blackmenu.setBackground(new Color(77, 195, 255));
     	blackmenu.setPreferredSize(new Dimension(10,20));

     	JMenu archivo = new JMenu("Archivo");
     	JMenuItem unoA = new JMenuItem("Abrir...",KeyEvent.VK_A);
     	unoA.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Abrir");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Abrir");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(this);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});
     	JMenuItem dosA = new JMenuItem("Guardar como...",KeyEvent.VK_E);
     	dosA.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Guardar como...");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Guardar como...");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(this);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});

     	JMenu tresA = new JMenu("Archivos Recientes");
     	tresA.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Archivos Recientes");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Archivos Recientes");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(this);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});

     	JMenuItem cuatroA = new JMenuItem("Archivo 1",KeyEvent.VK_1);
     	cuatroA.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Archivo 1");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Archivo 1");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(this);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});

     	JMenuItem cincoA = new JMenuItem("Archivo 2",KeyEvent.VK_2);
     	cincoA.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Archivo 2");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Archivo 2");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(this);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});

     	JMenuItem seisA = new JMenuItem("Archivo 3",KeyEvent.VK_3);
     	seisA.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Archivo 3");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Archivo 3");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(this);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});


     	//Editar
     	JMenu editar = new JMenu("Editar");

     	JMenuItem unoE = new JMenuItem("Copiar",KeyEvent.VK_C);
     	unoE.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Copiar");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Copiar");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(this);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});

     	JMenuItem dosE = new JMenuItem("Cortar",KeyEvent.VK_X);
     	dosE.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Cortar");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Cortar");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(this);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});

     	JMenuItem tresE = new JMenuItem("Pegar",KeyEvent.VK_P);
     	tresE.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Pegar");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Pegar");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(this);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});

		//Preferencias
     	JMenu cuatroE = new JMenu("Preferencias");
     	cuatroE.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Preferencias");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Preferencias");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(this);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});

     	//Ajustes
     	JMenuItem cincoE = new JMenuItem("Ajustes",KeyEvent.VK_J);
     	cincoE.addActionListener((ActionEvent e) -> {
			JFrame x = new JFrame("Ajustes");
			JPanel y = new JPanel();
			JLabel l = new JLabel("Ajustes");
			x.setSize(170,100);
			x.setVisible(true);
			x.setLocationRelativeTo(this);
			l.setHorizontalAlignment(JLabel.CENTER);
    		l.setVerticalAlignment(JLabel.CENTER);			
    		x.add(y);
			x.add(l);
			});



     	archivo.add(unoA);
     	archivo.add(dosA);
     	tresA.add(cuatroA);
     	tresA.add(cincoA);
     	tresA.add(seisA);
     	archivo.add(tresA);

     	editar.add(unoE);
     	editar.add(dosE);
     	editar.add(tresE);
     	cuatroE.add(cincoE);
     	editar.add(cuatroE);

     	blackmenu.add(archivo);
     	blackmenu.add(editar);
		setJMenuBar(blackmenu);
	}

}


	
	







/*
public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                mostrar();
            }
        });
    }*/
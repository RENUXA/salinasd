package tareaHilos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

public class TareaHilos extends JFrame {

	public JProgressBar pgBarra;
	private JPanel contentPane;
	public Controlador c;
	public JFrame ventana;
	public JButton boton;
	int seg;
	Thread tiempo = new Thread() {
		public void run() {
			try {
				for (seg = 1; seg <= 100; seg++) {
					pgBarra.setValue(seg);
					Thread.sleep(50);
				}
			} catch (Exception e) {
			}
		}
	};

	public static void main(String[] args) {
		TareaHilos b = new TareaHilos();
	}
	public class Controlador implements ActionListener{
		public void actionPerformed(ActionEvent evt) {
			new Thread(new Hilo()).start();
		}
	}
	public class Hilo implements Runnable{
		public void run() {
			for(int i= 0; i<= 100; i++) {
				pgBarra.setValue(i);
				pgBarra.repaint();
				try {
					Thread.sleep(50);
				}catch(Exception e) {
					
				}
			}
		}
	}
	public void ensamblar() {
		ventana.add(pgBarra);
		ventana.add(boton);
		ventana.pack();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public TareaHilos() {
		c = new Controlador();
		ventana = new JFrame ("BARRA CARGANDO!!");  
		boton = new JButton ("CARGAR");
		boton.addActionListener(c);
		
		pgBarra = new JProgressBar(0,100);
		ventana.setLayout(new FlowLayout());
		ensamblar();
		

	}
}

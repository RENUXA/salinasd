import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class PruebaGrafica extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor1;
	private JTextField txtValor2;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JPanel panel_3;
	private JLabel lblNewLabel_3;
	private JTextArea txtR;
	private JLabel lblNewLabel_2;
	private JTextField txtItera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaGrafica frame = new PruebaGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PruebaGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() 
		{
			
		
		    public  void actionPerformed(ActionEvent e) {
		    	String Valor1, Valor2;
				int ValorInt1, ValorInt2; 
				
				
				Valor1 = txtValor1.getText();
				Valor2 = txtValor2.getText();
				
				ValorInt1 = Integer.parseInt(Valor1);
				ValorInt2 = Integer.parseInt(Valor2);
			    
				int Iteraciones = Integer.parseInt(txtItera.getText());
				int x = 0;
			    while(x!=Iteraciones)
			    {
			        int valor3=ValorInt1 + ValorInt2;
			        Valor1 = Integer.toString(valor3);
			        txtR.setText(txtR.getText()+"\n" + Valor1);
			        
			         

			         x=x+1;
			        
			        ValorInt1=ValorInt2;
			        ValorInt2=valor3;
			    }
		    }
		    {
		    	
			}
		});
	
		contentPane.add(btnCalcular, BorderLayout.SOUTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Inserte el PRIMER valor ");
		panel.add(lblNewLabel);
		
		txtValor1 = new JTextField();
		panel.add(txtValor1);
		txtValor1.setBackground(Color.WHITE);
		txtValor1.setColumns(10);
		
		panel_1 = new JPanel();
		panel.add(panel_1);
		
		lblNewLabel_1 = new JLabel("Inserte el SEGUNDO valor");
		panel_1.add(lblNewLabel_1);
		
		txtValor2 = new JTextField();
		panel.add(txtValor2);
		txtValor2.setBackground(Color.WHITE);
		txtValor2.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Numero de Iteraciones");
		panel.add(lblNewLabel_2);
		
		txtItera = new JTextField();
		panel.add(txtItera);
		txtItera.setColumns(10);
		
		panel_3 = new JPanel();
		panel.add(panel_3);
		
		lblNewLabel_3 = new JLabel("RESULTADO");
		panel_3.add(lblNewLabel_3);
		
		txtR = new JTextArea();
		txtR.setTabSize(10);
		panel.add(txtR);
	}

}

package Modulo3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla1 {

	private JFrame frame;
	private JTextField textNota1;
	private JTextField textNota2;
	private JTextField textNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla1 window = new Pantalla1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pantalla1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio de notas");
		lblPromedio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblPromedio.setBounds(120, 46, 188, 25);
		frame.getContentPane().add(lblPromedio);
		
		JLabel lblNota1 = new JLabel("nota 1");
		lblNota1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNota1.setBounds(37, 125, 52, 20);
		frame.getContentPane().add(lblNota1);
		
		JLabel lblNota2 = new JLabel("nota 2");
		lblNota2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNota2.setBounds(37, 159, 52, 20);
		frame.getContentPane().add(lblNota2);
		
		JLabel lblNota3 = new JLabel("nota 3");
		lblNota3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNota3.setBounds(37, 193, 52, 20);
		frame.getContentPane().add(lblNota3);
		
		textNota1 = new JTextField();
		textNota1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNota1.setBounds(112, 127, 86, 20);
		frame.getContentPane().add(textNota1);
		textNota1.setColumns(10);
		
		textNota2 = new JTextField();
		textNota2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNota2.setColumns(10);
		textNota2.setBounds(112, 159, 86, 20);
		frame.getContentPane().add(textNota2);
		
		textNota3 = new JTextField();
		textNota3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNota3.setColumns(10);
		textNota3.setBounds(112, 193, 86, 20);
		frame.getContentPane().add(textNota3);
		
		JLabel lblNewLabel = new JLabel("Promedio:");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(292, 125, 84, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setOpaque(true);
		lblResultado.setBackground(Color.MAGENTA);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResultado.setBounds(292, 155, 88, 25);
		frame.getContentPane().add(lblResultado);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float nota1= Float.parseFloat(textNota1.getText());
				float nota2= Float.parseFloat(textNota2.getText());
				float nota3= Float.parseFloat(textNota3.getText());
				float promedio = (nota1+nota2+nota3)/3;
				lblResultado.setText(Float.toString(promedio));
				if(promedio>=7) {
					lblResultado.setBackground(Color.green);
				}else {
					lblResultado.setBackground(Color.red);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(150, 221, 118, 29);
		frame.getContentPane().add(btnNewButton);
	}
}

package Modulo4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaConArray {

	private JFrame frame;
	private JComboBox comboBox;
	private JList listResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaConArray window = new PantallaConArray();
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
	public PantallaConArray() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 27));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tablas de Multiplicar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(107, 43, 184, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tabla del ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(44, 97, 64, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		String strTablas []=new String [16];
		for(int i=0; i<strTablas.length;i++)
			strTablas[i]= Integer.toString(i);
		comboBox.setModel(new DefaultComboBoxModel(strTablas));
		comboBox.setBounds(118, 96, 71, 20);
		frame.getContentPane().add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(107, 128, 100, 100);
		frame.getContentPane().add(scrollPane);
		
		listResult = new JList();
		listResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(listResult);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tabla =comboBox.getSelectedIndex();
				//listResult.add
				
				String [] values = new String [10];
				for (int i=0; i<10;i++)
					values[i]= i +"x"+ tabla + "="+ (i*tabla);
				
				listResult.setModel(new AbstractListModel() {
					public int getSize() {
						return values.length;
	
					}
					public Object getElementAt (int index) {
						return values [index];
					}
					
				});
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(278, 153, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}

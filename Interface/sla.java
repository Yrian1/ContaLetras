package Interface;

import java.awt.EventQueue;
import negocio.Texto;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sla {

	private JFrame frame;
	private JTextField meuTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sla window = new sla();
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
	public sla() {
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
		
		meuTexto = new JTextField();
		meuTexto.setBounds(143, 42, 233, 91);
		frame.getContentPane().add(meuTexto);
		meuTexto.setColumns(10);
		
		JTextPane resultado = new JTextPane();
		resultado.setBounds(96, 189, 251, 20);
		frame.getContentPane().add(resultado);
		
		JLabel lblNewLabel = new JLabel("Digite texto:");
		lblNewLabel.setBounds(112, 21, 73, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("vogais");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto meuTxt = new Texto(meuTexto.getText());
				resultado.setText("a quantidade de vogais são:" + meuTxt.getVogais());
			}
		});
		btnNewButton.setBounds(21, 42, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("consoantes");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto meuTxt = new Texto(meuTexto.getText());
				resultado.setText("a quantidade de consoantes são:" + meuTxt.getConsoantes());
			}
		});
		btnNewButton_1.setBounds(21, 76, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("outros");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Texto meuTxt = new Texto(meuTexto.getText());
				resultado.setText("a quantidade de outros são:" + meuTxt.getOutros());
			}
		});
		btnNewButton_2.setBounds(21, 110, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(21, 189, 65, 14);
		frame.getContentPane().add(lblNewLabel_1);
		

	}
}

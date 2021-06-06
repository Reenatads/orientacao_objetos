
package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import control.imcControle;

public class MainViewer {

	private JFrame appFrame;
	private JTextField pesoTextField;
	private JTextField alturaTextField;
	private JTextPane resultPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainViewer window = new MainViewer();
					window.appFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainViewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		appFrame = new JFrame();
		appFrame.getContentPane().setBackground(new Color(240, 240, 240));
		appFrame.setAlwaysOnTop(true);
		appFrame.setTitle("Calculadora IMC");
		appFrame.setBounds(100, 100, 342, 400);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora IMC");
		lblNewLabel.setBounds(54, 29, 216, 37);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		appFrame.getContentPane().add(lblNewLabel);
		
		JLabel pesoLabel = new JLabel("Peso   (KG)");
		pesoLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		pesoLabel.setBounds(54, 95, 70, 14);
		appFrame.getContentPane().add(pesoLabel);
		
		pesoTextField = new JTextField();
		pesoTextField.setHorizontalAlignment(SwingConstants.CENTER);
		pesoTextField.setText("0.0");
		pesoTextField.setBounds(134, 91, 136, 25);
		appFrame.getContentPane().add(pesoTextField);
		pesoTextField.setColumns(10);
		
		JLabel alturaLabel = new JLabel("Altura (CM)");
		alturaLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		alturaLabel.setBounds(54, 132, 70, 14);
		appFrame.getContentPane().add(alturaLabel);
		
		alturaTextField = new JTextField();
		alturaTextField.setHorizontalAlignment(SwingConstants.CENTER);
		alturaTextField.setForeground(new Color(0, 0, 0));
		alturaTextField.setText("0.0");
		alturaTextField.setColumns(10);
		alturaTextField.setBounds(134, 127, 136, 25);
		appFrame.getContentPane().add(alturaTextField);
		
		JButton calcularButton = new JButton("Calcular");
		calcularButton.setBounds(54, 176, 216, 25);
		calcularButton.addActionListener(new imcControle(this));
		appFrame.getContentPane().add(calcularButton);
		
		resultPane = new JTextPane();
		resultPane.setBorder(new EmptyBorder(8, 8, 8, 8));
		resultPane.setForeground(new Color(0, 0, 0));
		resultPane.setToolTipText("");
		resultPane.setText("Resultado");
		resultPane.setBounds(54, 225, 216, 80);
		appFrame.getContentPane().add(resultPane);
	}

	public JFrame getAppFrame() {
		return appFrame;
	}

	public void setAppFrame(JFrame appFrame) {
		this.appFrame = appFrame;
	}

	public JTextField getPesoTextField() {
		return pesoTextField;
	}

	public void setPesoTextField(JTextField pesoTextField) {
		this.pesoTextField = pesoTextField;
	}

	public JTextField getAlturaTextField() {
		return alturaTextField;
	}

	public void setAlturaTextField(JTextField alturaTextField) {
		this.alturaTextField = alturaTextField;
	}

	public JTextPane getResultPane() {
		return resultPane;
	}

	public void setResultPane(JTextPane resultPane) {
		this.resultPane = resultPane;
	}
	
	
}

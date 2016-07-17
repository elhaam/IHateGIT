package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import DB.Driver;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpUI {

	private JFrame frame;
	Driver db = new Driver();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpUI window = new SignUpUI();
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
	public SignUpUI() {
		initialize();
	}
	
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpUI window = new SignUpUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u062B\u0628\u062A \u0646\u0627\u0645");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u067E\u0631\u0633\u0646\u0644\u06CC");
		label.setBounds(314, 54, 78, 14);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(182, 51, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u0631\u0645\u0632");
		label_1.setBounds(336, 172, 46, 14);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 169, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("\u062B\u0628\u062A \u0646\u0627\u0645");
		button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					frame.dispose();
//					System.out.println(textField.getText());
//					System.out.println(textField_1.getText());
					try{
						db.insert("signup", Integer.parseInt(textField.getText()), textField_1.getText(), textField_2.getText(), textField_3.getText());
						LoginUI s = new LoginUI();
						s.newScreen();
						
					}catch(NumberFormatException ex){ // handle your exception
						JOptionPane.showMessageDialog(null, "EmployeeID not Correct");
						
					}
			}
		});
		button.setBounds(30, 212, 89, 23);
		frame.getContentPane().add(button);
		
		JLabel label_2 = new JLabel("\u0646\u0627\u0645");
		label_2.setBounds(336, 95, 46, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC");
		label_3.setBounds(314, 132, 78, 14);
		frame.getContentPane().add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(182, 92, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(182, 129, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}

}

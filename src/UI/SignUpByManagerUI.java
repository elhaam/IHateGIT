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

public class SignUpByManagerUI {

	private JFrame frame;
	Driver db = new Driver();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpByManagerUI window = new SignUpByManagerUI();
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
	public SignUpByManagerUI() {
		initialize();
	}
	
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpByManagerUI window = new SignUpByManagerUI();
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
		label_1.setBounds(336, 112, 46, 14);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 109, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("\u062B\u0628\u062A \u0646\u0627\u0645");
		button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					frame.dispose();
//					System.out.println(textField.getText());
//					System.out.println(textField_1.getText());
					try{
						db.insert("login", Integer.parseInt(textField.getText()), textField_1.getText());
						JOptionPane.showMessageDialog(null, "added to users in system.");
						HomeUI s = new HomeUI();
						s.newScreen();
						
					}catch(NumberFormatException ex){ // handle your exception
						JOptionPane.showMessageDialog(null, "EmployeeID not Correct");
						
					}
			}
		});
		button.setBounds(39, 193, 89, 23);
		frame.getContentPane().add(button);
	}

}

package UI;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.Event.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignUpUI extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel label;

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
	 * Create the application.
	 */
	public SignUpUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u062B\u0628\u062A\u200C\u0646\u0627\u0645");
		frame.setBounds(100, 100, 450, 261);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(235, 43, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(235, 87, 86, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel username = new JLabel("\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631\u06CC");
		username.setBounds(355, 46, 46, 14);
		frame.getContentPane().add(username);
		
		JLabel lblNewLabel_1 = new JLabel("\u0631\u0645\u0632 \u0639\u0628\u0648\u0631");
		lblNewLabel_1.setBounds(355, 90, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(375, 139, 26, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		label = new JLabel("\u062B\u0628\u062A\u200C\u0646\u0627\u0645 \u0628\u0647 \u0639\u0646\u0648\u0627\u0646 \u0645\u062F\u06CC\u0631 \u0645\u06CC\u0627\u0646\u06CC");
		label.setBounds(235, 139, 140, 23);
		frame.getContentPane().add(label);
		
		JButton signUp_btn = new JButton("\u062B\u0628\u062A\u200C\u0646\u0627\u0645");
		signUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				
				LoginUI s = new LoginUI();
				s.newScreen();
			}
		});
		
		signUp_btn.setBounds(32, 164, 89, 23);
		frame.getContentPane().add(signUp_btn);
	}
}

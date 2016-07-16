package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeUI window = new WelcomeUI();
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
					WelcomeUI window = new WelcomeUI();
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
	public WelcomeUI() {
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
		
		JLabel label = new JLabel("\u0628\u0647 \u0633\u0627\u0645\u0627\u0646\u0647 \u0628\u0631\u0646\u0627\u0645\u0647 \u0631\u06CC\u0632\u06CC \u0648 \u0645\u062F\u06CC\u0631\u06CC\u062A \u0645\u0646\u0627\u0628\u0639 \u0633\u0627\u0632\u0645\u0627\u0646\u06CC \u0633\u06CC\u0645\u0631\u063A \u062E\u0648\u0634 \u0622\u0645\u062F\u06CC\u062F.");
		label.setBounds(121, 23, 313, 14);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("\u0648\u0631\u0648\u062F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				LoginUI s = new LoginUI();
				s.newScreen();
			}
		});
		button.setBounds(121, 205, 89, 23);
		frame.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("\u062B\u0628\u062A\u200C\u0646\u0627\u0645");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				SignUpUI s = new SignUpUI();
				s.newScreen();
			}
		});
		btnNewButton.setBounds(22, 205, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}

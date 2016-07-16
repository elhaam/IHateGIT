package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfileEditUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtAndroid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileEditUI window = new ProfileEditUI();
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
	public ProfileEditUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0648\u06CC\u0631\u0627\u06CC\u0634 \u0645\u0634\u062E\u0635\u0627\u062A \u06A9\u0627\u0631\u0628\u0631");
		frame.setBounds(100, 100, 450, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631\u06CC");
		label.setBounds(370, 22, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u0648 \u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC");
		label_1.setBounds(340, 59, 94, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u06A9\u062F \u0645\u0644\u06CC");
		label_2.setBounds(370, 97, 46, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u06A9\u0627\u0631\u0645\u0646\u062F\u06CC");
		label_3.setBounds(340, 135, 76, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u062A\u0644\u0641\u0646");
		label_4.setBounds(370, 178, 30, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("\u062A\u062E\u0635\u0635");
		label_5.setBounds(370, 222, 46, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\u0633\u0645\u062A");
		label_6.setBounds(370, 260, 46, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("ejafari");
		label_7.setBounds(197, 22, 46, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_9 = new JLabel("\u06F1\u06F0\u06F5\u06F0\u06F4\u06F5\u06F6\u06F7\u06F8\u06F9");
		label_9.setBounds(187, 97, 81, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("\u06F9\u06F8\u06F7\u06F6\u06F5\u06F4\u06F3\u06F2\u06F1");
		label_10.setBounds(187, 135, 91, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_13 = new JLabel("\u0645\u062F\u06CC\u0631 \u0645\u06CC\u0627\u0646\u06CC");
		label_13.setBounds(205, 260, 50, 14);
		frame.getContentPane().add(label_13);
		
		JButton button = new JButton("\u0644\u063A\u0648");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				HomeUI s = new HomeUI();
				s.newScreen();
			}
		});
		button.setBounds(41, 218, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u062B\u0628\u062A \u0648\u06CC\u0631\u0627\u06CC\u0634");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				SuccessUI s = new SuccessUI();
				s.newScreen();
			}
		});
		button_1.setBounds(41, 251, 89, 23);
		frame.getContentPane().add(button_1);
		
		textField = new JTextField();
		textField.setText("\u06F0\u06F9\u06F1\u06F2\u06F3\u06F4\u06F5\u06F6\u06F7\u06F8\u06F9");
		textField.setBounds(182, 175, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("\u0627\u0644\u0647\u0627\u0645 \u062C\u0639\u0641\u0631\u06CC");
		textField_1.setBounds(182, 56, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		txtAndroid = new JTextField();
		txtAndroid.setText("Android");
		txtAndroid.setBounds(182, 219, 86, 20);
		frame.getContentPane().add(txtAndroid);
		txtAndroid.setColumns(10);
	}

	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileEditUI window = new ProfileEditUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
}

package UI;
//package UI;
//
//import java.awt.EventQueue;
//import java.awt.Toolkit;
//import java.awt.event.WindowEvent;
//import java.awt.*;
//import java.awt.Event.*;
//
//import javax.swing.JFrame;
//import javax.swing.JTextField;
//import javax.swing.JPasswordField;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JRadioButton;
//import javax.swing.JCheckBox;
//import javax.swing.SwingConstants;
//
//import DB.Driver;
//
//import javax.swing.JButton;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class SignUpUI extends JFrame {
//
//	private JFrame frame;
//	private JTextField textField;
//	private JPasswordField passwordField;
//	Driver db = new Driver();
//	private JTextField textField1;
//	private JTextField textField2;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SignUpUI window = new SignUpUI();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	public static void newScreen() {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SignUpUI window = new SignUpUI();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//
//	/**
//	 * Create the application.
//	 */
//	public SignUpUI() {
//		getContentPane().setLayout(null);
//
//		JLabel label_1 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u067E\u0631\u0633\u0646\u0644\u06CC");
//		label_1.setBounds(309, 47, 84, 14);
//		getContentPane().add(label_1);
//
//		JLabel label_2 = new JLabel("\u0631\u0645\u0632");
//		label_2.setBounds(326, 95, 46, 14);
//		getContentPane().add(label_2);
//
//		textField1 = new JTextField();
//		textField1.setBounds(178, 44, 86, 20);
//		getContentPane().add(textField1);
//		textField1.setColumns(10);
//
//		JButton button = new JButton("\u062B\u0628\u062A \u0646\u0627\u0645");
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//
//			}
//		});
//		button.setBounds(43, 191, 89, 23);
//		getContentPane().add(button);
//		
//		textField2 = new JTextField();
//		textField2.setBounds(178, 92, 86, 20);
//		getContentPane().add(textField2);
//		textField2.setColumns(10);
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.setTitle("\u062B\u0628\u062A\u200C\u0646\u0627\u0645");
//		frame.setBounds(100, 100, 450, 261);
//		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//
//		textField = new JTextField();
//		textField.setBounds(235, 43, 86, 20);
//		frame.getContentPane().add(textField);
//		textField.setColumns(10);
//
//		passwordField = new JPasswordField();
//		passwordField.setBounds(235, 87, 86, 20);
//		frame.getContentPane().add(passwordField);
//
//		JLabel username = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u067E\u0631\u0633\u0646\u0644\u06CC");
//		username.setBounds(341, 46, 83, 14);
//		frame.getContentPane().add(username);
//
//		JLabel lblNewLabel_1 = new JLabel("\u0631\u0645\u0632 \u0639\u0628\u0648\u0631");
//		lblNewLabel_1.setBounds(355, 90, 46, 14);
//		frame.getContentPane().add(lblNewLabel_1);
//
//		JButton signUp_btn = new JButton("\u062B\u0628\u062A\u200C\u0646\u0627\u0645");
//		signUp_btn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				frame.dispose();
//				System.out.println(textField1.getText());
//				System.out.println(textField2.getText());
//				try{
//					db.insert("signup", Integer.parseInt(textField1.getText()), textField2.getText());
//					LoginUI s = new LoginUI();
//					s.newScreen();
//					
//				}catch(NumberFormatException ex){ // handle your exception
//					JOptionPane.showMessageDialog(null, "EmployeeID not Correct");
//					
//				}
//
//
//
//				
//			}
//		});
//
//		signUp_btn.setBounds(32, 164, 89, 23);
//		frame.getContentPane().add(signUp_btn);
//	}
//}

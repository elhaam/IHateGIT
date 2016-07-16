package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.Event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DB.Driver;
import UI.HomeUI;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class LoginUI2 extends JFrame {

	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pst = null;

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
	Driver db = new Driver();
	String dbpass;

	/**
	 * Launch the application.
	 */
	//	public static void main(String[] args) {
	//		EventQueue.invokeLater(new Runnable() {
	//			public void run() {
	//				try {
	//					LoginUI frame = new LoginUI();
	//					frame.setVisible(true);
	//				} catch (Exception e) {
	//					e.printStackTrace();
	//				}
	//			}
	//		});
	//	}


	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI2 frame = new LoginUI2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	/**
	 * Create the frame.
	 */
	public LoginUI2() {
		setTitle("\u0648\u0631\u0648\u062F");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 432, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 396, 158);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631\u06CC");
		lblNewLabel.setBounds(317, 40, 73, 14);
		panel.add(lblNewLabel);

		username = new JTextField();
		username.setBounds(204, 37, 86, 20);
		panel.add(username);
		username.setColumns(10);

		JLabel lblPassword = new JLabel("\u0631\u0645\u0632 \u0639\u0628\u0648\u0631");
		lblPassword.setBounds(328, 76, 62, 14);
		panel.add(lblPassword);

		password = new JPasswordField();
		password.setBounds(204, 73, 86, 20);
		panel.add(password);

		JButton loginEnter = new JButton("\u0648\u0631\u0648\u062F");
		loginEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//				System.exit(0);


				
				
//				rs = db.getARow("human-resource", "employeeid", username.getText());
//				System.out.println(rs);
////				if (!rs.equals(null)) {
////					try {
////						dbpass = rs.getString("password");
//						if (dbpass.equals(password.getText())){
//							close();
//							HomeUI s = new HomeUI();
//							s.newScreen();
//						}
////					}
						
						
						
//					catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//				if (rs.equals(null)){
//					close();
//					JOptionPane.showMessageDialog(null, "Username and password not Correct");
//				}


				/*
				 * DB starts here
				 */
								String sql = "Select * from human-resource where first_name=? and last_name = ?";
								try{
									Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
									con = DriverManager.getConnection("jdbc:odbc:login", "root", "admin");
									pst = con.prepareStatement(sql);
									pst.setString(1, username.getText());
									pst.setString(2, password.getText());
									rs = pst.executeQuery();
									if(rs.next()){
										JOptionPane.showMessageDialog(null, "Username and Password Matched");
										HomeUI s = new HomeUI();
										s.newScreen();
										setVisible(false);
									}
									else{
										JOptionPane.showMessageDialog(null, "Username and password not Correct");
									}
								}
								catch(Exception e){
									JOptionPane.showMessageDialog(null, e);
								}
				/*
				 * DB ends here
				 */
			}
		});
		loginEnter.setBounds(33, 116, 89, 23);
		panel.add(loginEnter);
	}
}

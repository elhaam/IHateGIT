package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import DB.Driver;
import ResourceManagment.Job;
import ResourceManagment.Subsystem;
import User.MiddleManager;
import User.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class LoginUI {

	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	String dbid;
	String dbpass;
	User user;
	MiddleManager middle;


	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRs = null;
	public String getDbid() {
		return dbid;
	}

	public void setDbid(String dbid) {
		this.dbid = dbid;
	}

	Driver db;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI window = new LoginUI();
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
	public LoginUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0648\u0631\u0648\u062F");
		frame.setBounds(100, 100, 368, 249);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u067E\u0631\u0633\u0646\u0644\u06CC");
		label.setBounds(253, 45, 89, 14);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("\u0631\u0645\u0632 \u0639\u0628\u0648\u0631");
		label_1.setBounds(270, 83, 46, 14);
		frame.getContentPane().add(label_1);

		textField1 = new JTextField();
		textField1.setBounds(128, 42, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);

		textField2 = new JTextField();
		textField2.setBounds(128, 80, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);

		JButton button = new JButton("\u0648\u0631\u0648\u062F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				String sql = "Select * from login where employeeid=?" + textField1.getText()+
//						"and password =" + textField2.getText();
				try {
					System.out.println("good");
					// 1. Get a connection to database
					myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simoorgh-managment-system", "root" , "admin");
					
					// 2. Create a statement
					myStmt = myConn.createStatement();
					
					// 3. Execute SQL query
					myRs = myStmt.executeQuery("select * from login where employeeid =" + textField1.getText() );
					
					// 4. Process the result set
					if (myRs.next()) {
						dbid = myRs.getString("employeeid");
						dbpass = myRs.getString("password");
						System.out.println(myRs.getString("employeeid") + ", " + myRs.getString("password"));
						if(dbpass.equals(textField2.getText())) {
//							System.out.println("avarin");
							frame.dispose();
							HomeUI s = new HomeUI();
							s.newScreen();
//							db.insert("thisuser", dbid);
//							myRs = myStmt.executeQuery("select * from `human-resource` where employeeid =" + textField1.getText() );
//							String fname = myRs.getString("firstname");
//							String lname = myRs.getString("lastname");
//							int meli = Integer.parseInt(myRs.getString("melinum"));
//							db.insert("thisuser", Integer.parseInt(dbid), "", "", "");
//							int eid = Integer.parseInt(myRs.getString("employeeid"));
//							String st = myRs.getString("startdate");
//							Job j = Job.EMPLOYEE;
//							Subsystem sub = Subsystem.DEVELOPMENTMAINTAINANCE;
//							String p = dbpass; 
//							if(myRs.getString("level").equalsIgnoreCase("employee")){
//								
//								
//								
//							}
//							if(myRs.getString("level").equalsIgnoreCase("middlemanager")) {
//								middle = new MiddleManager(fname, lname, meli, eid, st, j, sub, p);;
//							}
//							else {
//								int isMiddle = 0;
//								int isEmployee = 1;
//								user = new User(fname, lname, meli, eid, st, j, sub, p, isMiddle, isEmployee);
//								System.out.println(fname);
//							}
						}
						else {
//							System.out.println("nadariim");
							JOptionPane.showMessageDialog(null, "Username or password not Correct");
						}
					}
					else {
//						System.out.println("nadarim");
						JOptionPane.showMessageDialog(null, "Username or password not Correct");
					}
					
				}
				catch (Exception exc) {
					exc.printStackTrace();
				}
//				finally {
//					if (myRs != null) {
//						myRs.close();
//					}
//					
//					if (myStmt != null) {
//						myStmt.close();
//					}
//					
//					if (myConn != null) {
//						myConn.close();
//					}
//				}
			}
		});
		button.setBounds(39, 153, 89, 23);
		frame.getContentPane().add(button);
	}
	
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI window = new LoginUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}

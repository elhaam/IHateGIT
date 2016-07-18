package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

import DB.Driver;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VerifyUserUI {

	private JFrame frame;
	private JTable table;
	Driver db = new Driver();
	private JScrollPane scrollPane;
	private JTextField textField;
	private JLabel label;
	private JButton button_1;
	private JButton button_2;
	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRs = null;
	String dbid;
	String dbpass;
	private JButton button_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerifyUserUI window = new VerifyUserUI();
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
	public VerifyUserUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u062A\u0627\u0626\u06CC\u062F \u06A9\u0627\u0631\u0628\u0631\u0627\u0646");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton button = new JButton("\u0645\u0634\u0627\u0647\u062F\u0647 \u06A9\u0627\u0631\u0628\u0631\u0627\u0646 \u062A\u0627\u0626\u06CC\u062F \u0646\u0634\u062F\u0647");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs = db.getAllRows("signup");
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		button.setBounds(138, 11, 157, 23);
		frame.getContentPane().add(button);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(202, 52, 222, 198);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		textField = new JTextField();
		textField.setBounds(21, 85, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		label = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u067E\u0631\u0633\u0646\u0644\u06CC");
		label.setBounds(117, 88, 75, 14);
		frame.getContentPane().add(label);

		button_1 = new JButton("\u0627\u0636\u0627\u0641\u0647 \u06A9\u0646");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					System.out.println("good");
					// 1. Get a connection to database
					myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simoorgh-managment-system", "root" , "admin");

					// 2. Create a statement
					myStmt = myConn.createStatement();

					// 3. Execute SQL query
					myRs = myStmt.executeQuery("select * from signup where employeeid =" + textField.getText() );

					// 4. Process the result set
					if (myRs.next()) {
						dbid = myRs.getString("employeeid");
						dbpass = myRs.getString("password");
						System.out.println(myRs.getString("employeeid") + ", " + myRs.getString("password"));
						db.delete("signup", "employeeid", dbid);
						db.insert("login", Integer.parseInt(dbid), dbpass);

						JOptionPane.showMessageDialog(null, dbid + "added to users in system.");
						
					}

				}
				catch (Exception exc) {
					exc.printStackTrace();
				}

			}
		});
		button_1.setBounds(18, 128, 89, 23);
		frame.getContentPane().add(button_1);

		button_2 = new JButton("\u062D\u0630\u0641 \u06A9\u0646");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					System.out.println("good");
					// 1. Get a connection to database
					myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simoorgh-managment-system", "root" , "admin");

					// 2. Create a statement
					myStmt = myConn.createStatement();

					// 3. Execute SQL query
					myRs = myStmt.executeQuery("select * from signup where employeeid =" + textField.getText() );

					// 4. Process the result set
					if (myRs.next()) {
						dbid = myRs.getString("employeeid");
						dbpass = myRs.getString("password");
						System.out.println(myRs.getString("employeeid") + ", " + myRs.getString("password"));
						db.delete("signup", "employeeid", dbid);
//						db.insert("login", Integer.parseInt(dbid), dbpass);

						JOptionPane.showMessageDialog(null, dbid + "added to users in system.");
						
					}

				}
				catch (Exception exc) {
					exc.printStackTrace();
				}
			}
		});
		button_2.setBounds(18, 162, 89, 23);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("\u062E\u0627\u0646\u0647");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				HomeUI s = new HomeUI();
				s.newScreen();
			}
		});
		button_3.setBounds(18, 196, 89, 23);
		frame.getContentPane().add(button_3);
	}

	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerifyUserUI window = new VerifyUserUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});			
	}
	private void fillComboBox(JComboBox comboBox,String tablename,String... id) {
		// TODO Auto-generated method stub

		System.out.println(tablename);
		ResultSet all=db.getAllRows(tablename);
		System.out.println(all);
		try {
			int j=0;
			while(all.next()){
				System.out.println(tablename+":  "+all.getString(id[j]));
				comboBox.addItem(all.getString(id[j]));
			}
			all.close();
			//return comboBox.getSelectedItem().toString();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		//return null;
	}
}

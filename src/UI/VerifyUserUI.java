package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
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
				ResultSet rs = db.getAllRows("login");
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
				try{
					ResultSet rs = db.getARow("signup", "employeeid", textField.getText());
//					db.insert("login", textField.getText());
//					System.out.println(rs.);
					
//					db.insert("signup", Integer.parseInt(textField.getText()), textField_1.getText(), textField_2.getText(), textField_3.getText());
//					LoginUI s = new LoginUI();
//					s.newScreen();
					
				}catch(NumberFormatException ex){ // handle your exception
					JOptionPane.showMessageDialog(null, "EmployeeID not Correct");
					
				}
				
			}
		});
		button_1.setBounds(18, 128, 89, 23);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("\u062D\u0630\u0641 \u06A9\u0646");
		button_2.setBounds(18, 162, 89, 23);
		frame.getContentPane().add(button_2);
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
}

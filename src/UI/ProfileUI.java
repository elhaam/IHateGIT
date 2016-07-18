package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

import DB.Driver;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;

public class ProfileUI {

	private JFrame frame;
	private JTable table;
	Driver db = new Driver();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileUI window = new ProfileUI();
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
	public ProfileUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0646\u0645\u0627\u06CC\u0634 \u0645\u0634\u062E\u0635\u0627\u062A \u06A9\u0627\u0631\u0628\u0631");
		frame.setBounds(100, 100, 450, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton button = new JButton("\u062E\u0627\u0646\u0647");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				// First option is selected

				HomeUI s = new HomeUI();
				s.newScreen();
			}
		});
		button.setBounds(22, 272, 89, 23);
		frame.getContentPane().add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 47, 414, 209);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton button_1 = new JButton("\u0646\u0645\u0627\u06CC\u0634");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs = db.getAllRows("thisuser");
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		button_1.setBounds(159, 11, 89, 23);
		frame.getContentPane().add(button_1);
	}

	public void newScreen() {
		LoginUI l = new LoginUI();
		System.out.println(l.getDbid());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileUI window = new ProfileUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});			
	}
}

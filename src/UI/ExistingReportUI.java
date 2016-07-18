package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;

import DB.Driver;
import Report.ExistingReportcc;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class ExistingReportUI {

	private JFrame frame;
	private JTable table;
	Driver db = new Driver();
	ExistingReportcc report = new ExistingReportcc();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExistingReportUI window = new ExistingReportUI();
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
	public ExistingReportUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u06AF\u0632\u0627\u0631\u0634 \u0645\u0646\u0627\u0628\u0639 \u0645\u0648\u062C\u0648\u062F");
		frame.setBounds(100, 100, 636, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("\u06AF\u0632\u0627\u0631\u0634 \u0645\u0646\u0627\u0628\u0639 \u0627\u0637\u0644\u0627\u0639\u0627\u062A\u06CC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs = db.getAllRows("informational-resource");
				table.setModel(DbUtils.resultSetToTableModel(rs));
//				ResultSet rs = db.getAllRows("login");
//				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		button.setBounds(477, 29, 133, 23);
		frame.getContentPane().add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 600, 298);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton button2 = new JButton("\u06AF\u0632\u0627\u0631\u0634 \u0645\u0646\u0627\u0628\u0639 \u0641\u06CC\u0632\u06CC\u06A9\u06CC");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs = db.getAllRows("physical-resource");
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		button2.setBounds(160, 29, 128, 23);
		frame.getContentPane().add(button2);
		
		JButton button1 = new JButton("\u06AF\u0632\u0627\u0631\u0634 \u0645\u0646\u0627\u0628\u0639 \u0627\u0646\u0633\u0627\u0646\u06CC");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs = db.getAllRows("human-resource");
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		button1.setBounds(315, 29, 133, 23);
		frame.getContentPane().add(button1);
		
		JButton button3 = new JButton("\u06AF\u0632\u0627\u0631\u0634 \u0645\u0646\u0627\u0628\u0639 \u0645\u0627\u0644\u06CC");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs = db.getAllRows("financial-resource");
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		button3.setBounds(10, 29, 128, 23);
		frame.getContentPane().add(button3);
	}
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExistingReportUI window = new ExistingReportUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
}

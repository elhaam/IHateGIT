package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;

import DB.Driver;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class NeededReportUI {

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
					NeededReportUI window = new NeededReportUI();
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
	public NeededReportUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u06AF\u0632\u0627\u0631\u0634 \u0645\u0646\u0627\u0628\u0639 \u0645\u0648\u0631\u062F \u0646\u06CC\u0627\u0632");
		frame.setBounds(100, 100, 634, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton button = new JButton("\u0645\u0646\u0627\u0628\u0639 \u0627\u0637\u0644\u0627\u0639\u0627\u062A\u06CC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs = db.getAllRows("assign_informational");
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		button.setBounds(477, 32, 117, 23);
		frame.getContentPane().add(button);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 598, 290);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("\u0645\u0646\u0627\u0628\u0639 \u0627\u0646\u0633\u0627\u0646\u06CC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs = db.getAllRows("assign_human");
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		btnNewButton.setBounds(339, 32, 105, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0645\u0646\u0627\u0628\u0639 \u0641\u06CC\u0632\u06CC\u06A9\u06CC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs = db.getAllRows("assign_physical");
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		btnNewButton_1.setBounds(185, 32, 105, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u0645\u0646\u0627\u0628\u0639 \u0645\u0627\u0644\u06CC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet rs = db.getAllRows("assign_finanicial");
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
		btnNewButton_2.setBounds(30, 32, 97, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
	
	
	
	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NeededReportUI window = new NeededReportUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
	}
}

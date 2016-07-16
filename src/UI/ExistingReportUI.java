package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;

import DB.Driver;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExistingReportUI {

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
		
		JButton button = new JButton("\u062A\u0648\u0644\u06CC\u062F \u06AF\u0632\u0627\u0631\u0634");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				db.getAllRows("");
			}
		});
		button.setBounds(244, 23, 89, 23);
		frame.getContentPane().add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 600, 298);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
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

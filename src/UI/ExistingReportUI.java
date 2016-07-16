package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;

public class ExistingReportUI {

	private JFrame frame;
	private JTable table;

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
		frame.setBounds(100, 100, 571, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 28, 535, 259);
		frame.getContentPane().add(table);
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

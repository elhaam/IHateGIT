package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class CyclicReportUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CyclicReportUI window = new CyclicReportUI();
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
	public CyclicReportUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u06AF\u0632\u0627\u0631\u0634 \u062C\u0631\u06CC\u0627\u0646 \u0686\u0631\u062E\u0634\u06CC \u0645\u0635\u0631\u0641");
		frame.setBounds(100, 100, 564, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 528, 273);
		frame.getContentPane().add(table);
	}

	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CyclicReportUI window = new CyclicReportUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});			
	}

}

package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Estimate {

	private JFrame frame;
	private JTextField textField;
	public int count=0;
	public JTextField tfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estimate window = new Estimate();
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
	public Estimate() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_86826730700911");
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u0627\u0646\u062F\u0627\u0632\u0647 \u06CC \u0633\u0627\u0645\u0627\u0646\u0647 \u06CC \u0646\u0631\u0645 \u0627\u0641\u0632\u0627\u0631\u06CC:");
		label.setBounds(226, 46, 157, 14);
		panel.add(label);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(173, 43, 29, 20);
		panel.add(spinner);
		
		JLabel label_1 = new JLabel("\u062A\u06A9\u0646\u0648\u0644\u0648\u0698\u06CC \u0647\u0627\u06CC \u0645\u0646\u062A\u062E\u0628:");
		label_1.setBounds(265, 86, 102, 14);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(154, 83, 101, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		
		JButton button = new JButton("\u0627\u0636\u0627\u0641\u0647 \u06A9\u0631\u062F\u0646");
		button.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				
				    tfield = new JTextField();
	                tfield.setName("technology" + count);
	                count++;
	                frame.add(tfield);
	                frame.revalidate();  // For JDK 1.7 or above.
	                //frame.getContentPane().revalidate(); // For JDK 1.6 or below.
	                frame.repaint();
			}
		});
		button.setBounds(55, 82, 89, 23);
		panel.add(button);
		
		
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "name_86830926283181");
	}

}

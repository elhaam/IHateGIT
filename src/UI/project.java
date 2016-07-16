package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class project {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project window = new project();
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
	public project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		panel.setToolTipText("\u0645\u062F\u06CC\u0631\u06CC\u062A \u067E\u0631\u0648\u0698\u0647\r\n");
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("\u0648\u06CC\u0631\u0627\u06CC\u0634 \u067E\u0631\u0648\u0698\u0647");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(49, 106, 134, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u062B\u0628\u062A \u067E\u0631\u0648\u0698\u0647");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(224, 106, 118, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u0645\u062F\u06CC\u0631\u06CC\u062A \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC");
		lblNewLabel.setBounds(162, 30, 104, 23);
		panel.add(lblNewLabel);
	}
}

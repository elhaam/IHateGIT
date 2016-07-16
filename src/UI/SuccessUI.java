package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuccessUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuccessUI window = new SuccessUI();
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
	public SuccessUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0627\u0646\u062C\u0627\u0645 \u0645\u0648\u0641\u0642\u06CC\u062A\u200C\u0622\u0645\u06CC\u0632");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0639\u0645\u0644\u06CC\u0627\u062A \u0645\u0648\u0631\u062F \u0646\u0638\u0631 \u0634\u0645\u0627 \u0628\u0627 \u0645\u0648\u0641\u0642\u06CC\u062A \u0627\u0646\u062C\u0627\u0645 \u0634\u062F.");
		label.setBounds(135, 58, 231, 14);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("\u062E\u0627\u0646\u0647");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				HomeUI s = new HomeUI();
				s.newScreen();
			}
		});
		button.setBounds(193, 103, 89, 23);
		frame.getContentPane().add(button);
		
		
	}
	
	
	
	

}

package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class VerifyUserUI {

	private JFrame frame;

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

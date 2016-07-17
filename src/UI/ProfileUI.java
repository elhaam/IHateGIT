package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfileUI {

	private JFrame frame;

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

		JLabel label = new JLabel("\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631\u06CC");
		label.setBounds(360, 40, 46, 14);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u0648 \u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC");
		label_1.setBounds(330, 77, 94, 14);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("\u06A9\u062F \u0645\u0644\u06CC");
		label_2.setBounds(360, 115, 46, 14);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u06A9\u0627\u0631\u0645\u0646\u062F\u06CC");
		label_3.setBounds(330, 153, 76, 14);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("\u062A\u0644\u0641\u0646");
		label_4.setBounds(360, 196, 30, 14);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("\u062A\u062E\u0635\u0635");
		label_5.setBounds(360, 240, 46, 14);
		frame.getContentPane().add(label_5);

		JLabel label_6 = new JLabel("\u0633\u0645\u062A");
		label_6.setBounds(360, 278, 46, 14);
		frame.getContentPane().add(label_6);

		JLabel lblEjafari = new JLabel("ejafari");
		lblEjafari.setBounds(187, 40, 46, 14);
		frame.getContentPane().add(lblEjafari);

		JLabel label_8 = new JLabel("\u0627\u0644\u0647\u0627\u0645 \u062C\u0639\u0641\u0631\u06CC");
		label_8.setBounds(177, 77, 59, 14);
		frame.getContentPane().add(label_8);

		JLabel label_7 = new JLabel("\u06F1\u06F0\u06F5\u06F0\u06F4\u06F5\u06F6\u06F7\u06F8\u06F9");
		label_7.setBounds(177, 115, 81, 14);
		frame.getContentPane().add(label_7);

		JLabel label_9 = new JLabel("\u06F9\u06F8\u06F7\u06F6\u06F5\u06F4\u06F3\u06F2\u06F1");
		label_9.setBounds(177, 153, 91, 14);
		frame.getContentPane().add(label_9);

		JLabel label_10 = new JLabel("\u06F0\u06F9\u06F1\u06F2\u06F3\u06F4\u06F5\u06F6\u06F7\u06F8\u06F9");
		label_10.setBounds(177, 196, 81, 14);
		frame.getContentPane().add(label_10);

		JLabel lblAndroid = new JLabel("Android");
		lblAndroid.setBounds(197, 240, 46, 14);
		frame.getContentPane().add(lblAndroid);

		JLabel label_11 = new JLabel("\u0645\u062F\u06CC\u0631 \u0645\u06CC\u0627\u0646\u06CC");
		label_11.setBounds(195, 278, 50, 14);
		frame.getContentPane().add(label_11);

		JButton button = new JButton("\u062E\u0627\u0646\u0647");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				// First option is selected

				HomeUI s = new HomeUI();
				s.newScreen();
			}
		});
		button.setBounds(29, 263, 89, 23);
		frame.getContentPane().add(button);
	}

	public void newScreen() {
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

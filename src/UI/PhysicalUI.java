package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ResourceManagment.PhysicalResource;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PhysicalUI {

	private JFrame frame;
	private JTextField textFieldNo;
	private JTextField textFieldtype;
	private JTextField textFieldmodel;
	PhysicalResource physicalResource;

	/**
	 * Launch the application.
	 */
	public void showPhysicalUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhysicalUI window = new PhysicalUI();
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
	public PhysicalUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0645\u0646\u0628\u0639 \u0641\u06CC\u0632\u06CC\u06A9\u06CC");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0645\u0646\u0628\u0639 \u0641\u06CC\u0632\u06CC\u06A9\u06CC:");
		label.setBounds(165, 22, 116, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u0627\u0645\u0648\u0627\u0644:");
		label_1.setBounds(300, 66, 70, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u0646\u0648\u0639:");
		label_2.setBounds(300, 115, 46, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u0645\u062F\u0644/\u0627\u0633\u0645:");
		label_3.setBounds(300, 169, 70, 14);
		panel.add(label_3);
		
		textFieldNo = new JTextField();
		textFieldNo.setBounds(165, 63, 86, 20);
		panel.add(textFieldNo);
		textFieldNo.setColumns(10);
		
		textFieldtype = new JTextField();
		textFieldtype.setBounds(165, 112, 86, 20);
		panel.add(textFieldtype);
		textFieldtype.setColumns(10);
		
		textFieldmodel = new JTextField();
		textFieldmodel.setBounds(165, 166, 86, 20);
		panel.add(textFieldmodel);
		textFieldmodel.setColumns(10);
		
		JButton button = new JButton("\u062B\u0628\u062A \u0645\u0646\u0628\u0639");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				create(textFieldNo,textFieldtype,textFieldmodel);
			}
		});
		button.setBounds(29, 209, 89, 23);
		panel.add(button);
	}

	protected void create(JTextField textFieldNo2, JTextField textFieldtype2, JTextField textFieldmodel2) {
		// TODO Auto-generated method stub
		this.physicalResource=new PhysicalResource(Integer.parseInt(textFieldNo2.getText()), textFieldtype2.getText(), textFieldmodel2.getText());
		physicalResource.addResource();
		
	}
}

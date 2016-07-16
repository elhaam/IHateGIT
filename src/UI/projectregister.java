package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

import ResourceManagment.PhysicalResource;
import distributing.Project;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class projectregister {

	private JFrame frame;
	private JTextField projectName;
	private JTextField humanCount;
	private JTextField moduleCount;
	private JTextField technology;
	private JTextField reason;
	private JTextField startDate;
	private Project Project;

	/**
	 * Launch the application.
	 */
	public void showprojectregister() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					projectregister window = new projectregister();
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
	public projectregister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 11, 434, 288);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u067E\u0631\u0648\u0698\u0647");
		label.setBounds(172, 22, 132, 23);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(label);
		
		projectName = new JTextField();
		projectName.setBounds(152, 64, 86, 20);
		panel.add(projectName);
		projectName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u062A\u0639\u062F\u0627\u062F \u0645\u0627\u0698\u0648\u0644 :");
		lblNewLabel_2.setBounds(324, 126, 60, 23);
		panel.add(lblNewLabel_2);
		
		moduleCount = new JTextField();
		moduleCount.setBounds(152, 127, 86, 20);
		panel.add(moduleCount);
		moduleCount.setColumns(10);
		
		humanCount = new JTextField();
		humanCount.setBounds(152, 98, 86, 20);
		panel.add(humanCount);
		humanCount.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u062A\u0639\u062F\u0627\u062F \u0646\u06CC\u0631\u0648\u06CC \u0627\u0646\u0633\u0627\u0646\u06CC :");
		lblNewLabel_1.setBounds(282, 101, 102, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel(" \u0646\u0627\u0645 : ");
		lblNewLabel.setBounds(351, 64, 26, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("\u062A\u06A9\u0646\u0648\u0644\u0648\u0698\u06CC :");
		lblNewLabel_3.setBounds(332, 160, 52, 23);
		panel.add(lblNewLabel_3);
		
		technology = new JTextField();
		technology.setBounds(153, 161, 86, 20);
		panel.add(technology);
		technology.setColumns(10);
		
		JLabel reson = new JLabel("\u062F\u0644\u06CC\u0644 \u0627\u0633\u062A\u0641\u0627\u062F\u0647: ");
		reson.setBounds(318, 200, 83, 14);
		panel.add(reson);
		
		reason = new JTextField();
		reason.setBounds(152, 194, 86, 20);
		panel.add(reason);
		reason.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u062A\u0627\u0631\u06CC\u062E \u0634\u0631\u0648\u0639 :");
		lblNewLabel_4.setBounds(324, 236, 60, 14);
		panel.add(lblNewLabel_4);
		
		startDate = new JTextField();
		startDate.setBounds(154, 230, 86, 20);
		panel.add(startDate);
		startDate.setColumns(10);
		
		JButton btnNewButton = new JButton("\u062B\u0628\u062A \u067E\u0631\u0648\u0698\u0647");
		btnNewButton.setBounds(56, 254, 89, 23);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				create(projectName,humanCount ,moduleCount , technology,reason , startDate);
			}
		});
	}

	protected void create(JTextField projectName2, JTextField humanCount2, JTextField moduleCount2,JTextField technology, JTextField reason2,JTextField startDate2) {
		this.Project=new Project(projectName2.getText(),Integer.parseInt(humanCount2.getText()) ,Integer.parseInt(moduleCount2.getText()),technology.getText(),  reason2.getText(), startDate.getText());
		Project.addProject();
		// TODO Auto-generated method stub
		
	}
}

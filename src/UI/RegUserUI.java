package UI;

import java.awt.EventQueue;
import User.*;

import javax.swing.JFrame;
import javax.swing.JTextField;

import ResourceManagment.HumanResource;
import ResourceManagment.Job;
import ResourceManagment.Subsystem;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class RegUserUI {

	private JFrame frame;
	User user;
	public Job job;
	public Subsystem subsystem;
	private JTextField textFieldName;
	private JTextField textFieldLast;
	private JTextField textFieldID;
	private JTextField textFieldEID;
	private JTextField textFieldStart;
	private JTextField textFieldPass;
	protected int isMiddle = 0;
	protected int isEmployee = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegUserUI window = new RegUserUI();
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
	public RegUserUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u062B\u0628\u062A \u0645\u0633\u062A\u0642\u06CC\u0645 \u06A9\u0627\u0631\u0628\u0631 \u062A\u0648\u0633\u0637 \u0645\u062F\u06CC\u0631");
		frame.setBounds(100, 100, 482, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(206, 37, 86, 20);
		frame.getContentPane().add(textFieldName);
		
		JLabel label = new JLabel("\u0646\u0627\u0645:");
		label.setBounds(352, 43, 46, 14);
		frame.getContentPane().add(label);
		
		textFieldLast = new JTextField();
		textFieldLast.setColumns(10);
		textFieldLast.setBounds(206, 80, 86, 20);
		frame.getContentPane().add(textFieldLast);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC:");
		label_1.setBounds(352, 83, 62, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u0645\u0644\u06CC :");
		label_2.setBounds(352, 120, 62, 14);
		frame.getContentPane().add(label_2);
		
		textFieldID = new JTextField();
		textFieldID.setColumns(10);
		textFieldID.setBounds(206, 117, 86, 20);
		frame.getContentPane().add(textFieldID);
		
		textFieldEID = new JTextField();
		textFieldEID.setColumns(10);
		textFieldEID.setBounds(208, 160, 86, 20);
		frame.getContentPane().add(textFieldEID);
		
		JLabel label_3 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u06CC \u06A9\u0627\u0631\u0645\u0646\u062F\u06CC:");
		label_3.setBounds(352, 163, 88, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u062A\u0627\u0631\u06CC\u062E \u0634\u0631\u0648\u0639 \u06A9\u0627\u0631:");
		label_4.setBounds(352, 207, 88, 14);
		frame.getContentPane().add(label_4);
		
		textFieldStart = new JTextField();
		textFieldStart.setColumns(10);
		textFieldStart.setBounds(208, 204, 86, 20);
		frame.getContentPane().add(textFieldStart);
		
		JLabel label_5 = new JLabel("\u0633\u0645\u062A:");
		label_5.setBounds(381, 254, 46, 14);
		frame.getContentPane().add(label_5);
		
		JRadioButton middle = new JRadioButton("\u0645\u062F\u06CC\u0631 \u0645\u06CC\u0627\u0646\u06CC");
		middle.setBounds(232, 250, 109, 23);
		frame.getContentPane().add(middle);
		
		JRadioButton employee = new JRadioButton("\u06A9\u0627\u0631\u0645\u0646\u062F");
		employee.setBounds(161, 250, 109, 23);
		frame.getContentPane().add(employee);
		
		JLabel label_6 = new JLabel("\u0632\u06CC\u0631 \u0628\u062E\u0634:");
		label_6.setBounds(381, 299, 46, 14);
		frame.getContentPane().add(label_6);
		
		JRadioButton engineering = new JRadioButton("\u0645\u0647\u0646\u062F\u0633\u06CC \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC \u0647\u0627");
		engineering.setBounds(232, 295, 143, 23);
		frame.getContentPane().add(engineering);
		
		JRadioButton analysis = new JRadioButton("\u062A\u062D\u0644\u06CC\u0644");
		analysis.setBounds(104, 295, 109, 23);
		frame.getContentPane().add(analysis);
		
		JRadioButton design = new JRadioButton("\u0637\u0631\u0627\u062D\u06CC");
		design.setBounds(104, 338, 109, 23);
		frame.getContentPane().add(design);
		
		JRadioButton maintain = new JRadioButton("\u067E\u06CC\u0627\u062F\u0647 \u0633\u0627\u0632\u06CC \u0648 \u0646\u06AF\u0647\u062F\u0627\u0631\u06CC");
		maintain.setBounds(232, 338, 128, 23);
		frame.getContentPane().add(maintain);
		
		JLabel lblNewLabel = new JLabel("\u0631\u0645\u0632 \u0639\u0628\u0648\u0631");
		lblNewLabel.setBounds(381, 396, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldPass = new JTextField();
		textFieldPass.setBounds(208, 393, 86, 20);
		frame.getContentPane().add(textFieldPass);
		textFieldPass.setColumns(10);
		
		JButton button = new JButton("\u0641\u0639\u0627\u0644 \u0633\u0627\u0632\u06CC");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( engineering.isSelected()){
					subsystem=subsystem.REQUIREMENTENGINEERING;
				}
				else if( analysis.isSelected()){
					subsystem=subsystem.ANALYSIS;
				}
				if( design.isSelected()){
					subsystem=subsystem.DESIGN;
				}
				if( maintain.isSelected()){
					subsystem=subsystem.DEVELOPMENTMAINTAINANCE;
				}
				if(middle.isSelected()){
					job=job.MIDDLEMANAGER;
					isMiddle  = 1;
					isEmployee = 1;
				}
				else if(employee.isSelected()){
					job=job.EMPLOYEE;
					isEmployee = 1;
				}
				create(textFieldName ,textFieldLast,textFieldID,textFieldEID,textFieldStart,job,subsystem, textFieldPass, isMiddle, isEmployee);
				frame.dispose();
				System.out.println("PROFILE");
				SuccessUI s = new SuccessUI();
				s.newScreen();	
			}
		});
		button.setBounds(10, 431, 89, 23);
		frame.getContentPane().add(button);
	}

	public void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegUserUI window = new RegUserUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}

	protected void create(JTextField text1, JTextField text2, JTextField text3,
			JTextField text4, JTextField text5,Job job,Subsystem subsystem, JTextField text6, int m, int e) {
		// TODO Auto-generated method stub
		try{
			this.user = new User(text1.getText(), text2.getText(), Integer.parseInt(text3.getText()),
					Integer.parseInt(text4.getText()), text5.getText(), job, subsystem, text6.getText(), 
					m, e);
			user.addUser();
		}
		catch(Exception exp){
			exp.printStackTrace();
					System.out.println(user.firstName);
					System.out.println(user.lastName);
					System.out.println(user.employeeNo);
					System.out.println(user.melliNo);
					System.out.println(user.StartDate);
					System.out.println(user.job);
					System.out.println(user.subsystem);

		}

	}
}

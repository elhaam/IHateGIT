package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ResourceManagment.HumanResource;
import ResourceManagment.Job;
import ResourceManagment.Subsystem;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class HumanUI {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldLastName;
	private JTextField textFieldMelliNo;
	private JTextField textFieldEmployeeNo;
	private JTextField textFieldStartDate;
	HumanResource humanResource;
	public Job job;
	public Subsystem subsystem;

	/**
	 * Launch the application.
	 */
	public void showHumanUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanUI window = new HumanUI();
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
	public HumanUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0645\u0646\u0628\u0639 \u0627\u0646\u0633\u0627\u0646\u06CC:");
		lblNewLabel.setBounds(162, 24, 112, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\u0646\u0627\u0645:");
		label.setBounds(306, 58, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC:");
		label_1.setBounds(306, 98, 62, 14);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u0645\u0644\u06CC :");
		lblNewLabel_1.setBounds(306, 135, 62, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u06CC \u06A9\u0627\u0631\u0645\u0646\u062F\u06CC:");
		label_2.setBounds(306, 178, 88, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u0633\u0645\u062A:");
		label_3.setBounds(335, 269, 46, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u062A\u0627\u0631\u06CC\u062E \u0634\u0631\u0648\u0639 \u06A9\u0627\u0631:");
		label_4.setBounds(306, 222, 88, 14);
		frame.getContentPane().add(label_4);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(160, 52, 86, 20);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setBounds(160, 95, 86, 20);
		frame.getContentPane().add(textFieldLastName);
		textFieldLastName.setColumns(10);
		
		textFieldMelliNo = new JTextField();
		textFieldMelliNo.setBounds(160, 132, 86, 20);
		frame.getContentPane().add(textFieldMelliNo);
		textFieldMelliNo.setColumns(10);
		
		textFieldEmployeeNo = new JTextField();
		textFieldEmployeeNo.setBounds(162, 175, 86, 20);
		frame.getContentPane().add(textFieldEmployeeNo);
		textFieldEmployeeNo.setColumns(10);
		
		
		textFieldStartDate = new JTextField();
		textFieldStartDate.setBounds(162, 219, 86, 20);
		frame.getContentPane().add(textFieldStartDate);
		textFieldStartDate.setColumns(10);
		
		
		
		JRadioButton middleManager = new JRadioButton("\u0645\u062F\u06CC\u0631 \u0645\u06CC\u0627\u0646\u06CC");
		middleManager.setBounds(186, 265, 109, 23);
		frame.getContentPane().add(middleManager);
		
		JRadioButton employee = new JRadioButton("\u06A9\u0627\u0631\u0645\u0646\u062F");
		employee.setBounds(115, 265, 109, 23);
		frame.getContentPane().add(employee);
		
		JLabel label_5 = new JLabel("\u0632\u06CC\u0631 \u0628\u062E\u0634:");
		label_5.setBounds(335, 314, 46, 14);
		frame.getContentPane().add(label_5);
		
		JRadioButton requirmentEngineering = new JRadioButton("\u0645\u0647\u0646\u062F\u0633\u06CC \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC \u0647\u0627");
		requirmentEngineering.setBounds(186, 310, 143, 23);
		frame.getContentPane().add(requirmentEngineering);
		
		JRadioButton analysis = new JRadioButton("\u062A\u062D\u0644\u06CC\u0644");
		analysis.setBounds(58, 310, 109, 23);
		frame.getContentPane().add(analysis);
		
		JRadioButton design = new JRadioButton("\u0637\u0631\u0627\u062D\u06CC");
		design.setBounds(58, 353, 109, 23);
		frame.getContentPane().add(design);
		
		JRadioButton developmentMaintainance = new JRadioButton("\u067E\u06CC\u0627\u062F\u0647 \u0633\u0627\u0632\u06CC \u0648 \u0646\u06AF\u0647\u062F\u0627\u0631\u06CC");
		developmentMaintainance.setBounds(186, 353, 128, 23);
		frame.getContentPane().add(developmentMaintainance);
		
		JButton button = new JButton("\u062B\u0628\u062A \u0645\u0646\u0628\u0639");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( requirmentEngineering.isSelected()){
					subsystem=subsystem.REQUIREMENTENGINEERING;
				}
				else if( analysis.isSelected()){
					subsystem=subsystem.ANALYSIS;
				}
				if( design.isSelected()){
					subsystem=subsystem.DESIGN;
				}
				if( developmentMaintainance.isSelected()){
					subsystem=subsystem.DEVELOPMENTMAINTAINANCE;
				}
				if(middleManager.isSelected()){
					job=job.MIDDLEMANAGER;
				}
				else if(employee.isSelected()){
					job=job.EMPLOYEE;
				}
				create(textFieldName ,textFieldLastName,textFieldMelliNo,textFieldEmployeeNo,textFieldStartDate,job,subsystem);
			}
		});
		button.setBounds(38, 397, 89, 23);
		frame.getContentPane().add(button);
		
	}

	

	protected void create(JTextField textFieldName2, JTextField textFieldLastName2, JTextField textFieldMelliNo2,
			JTextField textFieldEmployeeNo2, JTextField textFieldStartDate2,Job job,Subsystem subsystem) {
		// TODO Auto-generated method stub
		try{
		this.humanResource=new HumanResource(textFieldName2.getText(), textFieldLastName2.getText(), Integer.parseInt(textFieldMelliNo2.getText()),
				Integer.parseInt(textFieldEmployeeNo2.getText()), textFieldStartDate2.getText(), job, subsystem);
		humanResource.addResource();
		}
		catch(Exception exp){
		exp.printStackTrace();
//		System.out.println(humanResource.firstName);
//		System.out.println(humanResource.lastName);
//		System.out.println(humanResource.employeeNo);System.out.println(humanResource.melliNo);System.out.println(humanResource.StartDate);
//		System.out.println(humanResource.job);
//		System.out.println(humanResource.subsystem);
		
		}
		
	}
}

package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import org.eclipse.wb.swing.FocusTraversalOnArray;

//import ResourceManagment.PhysicalResource;
import distributing.PhysicalRequirement;
//import distributing.Requirement;

import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegPhysicalRequirement {

	private JFrame frame;
	private JTextField textFieldres;
	private JTextField textFieldproject;
	private JTextField textFieldsection;
	private JTextField textFieldcount;
	//Requirement requirement;
	private PhysicalRequirement physialReq;
	private PhysicalRequirement physicalReq;
	private JTextField textFieldcreatedate;
	PhysicalRequirement physicalRequirement;
	/**
	 * Launch the application.
	 */
	
	
	public  void showRegPhysicalRequirement() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegPhysicalRequirement window = new RegPhysicalRequirement();
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
	public RegPhysicalRequirement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(null);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 19));
		frame.getContentPane().setEnabled(false);
		frame.setTitle("\u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC");
		frame.setBounds(100, 100, 467, 316);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setFont(new Font("Dialog", Font.PLAIN, 10));
		panel.setBounds(0, 0, 451, 277);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{54, 0, 86, 0, 55, 86, 50, 86, 0};
		gbl_panel.rowHeights = new int[]{31, 0, 23, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		textFieldres = new JTextField();
		GridBagConstraints gbc_textFieldres = new GridBagConstraints();
		gbc_textFieldres.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldres.fill = GridBagConstraints.BOTH;
		gbc_textFieldres.gridx = 5;
		gbc_textFieldres.gridy = 1;
		panel.add(textFieldres, gbc_textFieldres);
		textFieldres.setColumns(10);
		
		Label requirementName = new Label(": \u0646\u0627\u0645");
		GridBagConstraints gbc_requirementName = new GridBagConstraints();
		gbc_requirementName.anchor = GridBagConstraints.NORTHEAST;
		gbc_requirementName.insets = new Insets(0, 0, 5, 5);
		gbc_requirementName.gridx = 6;
		gbc_requirementName.gridy = 1;
		panel.add(requirementName, gbc_requirementName);
		requirementName.setAlignment(Label.RIGHT);
		requirementName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		textFieldcount = new JTextField();
		GridBagConstraints gbc_textFieldcount = new GridBagConstraints();
		gbc_textFieldcount.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldcount.fill = GridBagConstraints.BOTH;
		gbc_textFieldcount.gridx = 5;
		gbc_textFieldcount.gridy = 2;
		panel.add(textFieldcount, gbc_textFieldcount);
		textFieldcount.setColumns(10);
		
		JLabel count = new JLabel("\u062A\u0639\u062F\u0627\u062F : ");
		count.setFont(new Font("Dialog", Font.PLAIN, 19));
		GridBagConstraints gbc_count = new GridBagConstraints();
		gbc_count.anchor = GridBagConstraints.EAST;
		gbc_count.insets = new Insets(0, 0, 5, 5);
		gbc_count.gridx = 6;
		gbc_count.gridy = 2;
		panel.add(count, gbc_count);
		
		textFieldproject = new JTextField();
		GridBagConstraints gbc_textFieldproject = new GridBagConstraints();
		gbc_textFieldproject.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldproject.fill = GridBagConstraints.BOTH;
		gbc_textFieldproject.gridx = 5;
		gbc_textFieldproject.gridy = 3;
		panel.add(textFieldproject, gbc_textFieldproject);
		textFieldproject.setColumns(10);
		
		Label project = new Label(": \u067E\u0631\u0648\u0698\u0647");
		GridBagConstraints gbc_project = new GridBagConstraints();
		gbc_project.anchor = GridBagConstraints.NORTHEAST;
		gbc_project.insets = new Insets(0, 0, 5, 5);
		gbc_project.gridx = 6;
		gbc_project.gridy = 3;
		panel.add(project, gbc_project);
		project.setFont(new Font("Dialog", Font.PLAIN, 19));
		project.setAlignment(Label.RIGHT);
		
		textFieldsection = new JTextField();
		GridBagConstraints gbc_textFieldsection = new GridBagConstraints();
		gbc_textFieldsection.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldsection.fill = GridBagConstraints.BOTH;
		gbc_textFieldsection.gridx = 5;
		gbc_textFieldsection.gridy = 4;
		panel.add(textFieldsection, gbc_textFieldsection);
		textFieldsection.setColumns(10);
		
		Label section = new Label(": \u0628\u062E\u0634");
		GridBagConstraints gbc_section = new GridBagConstraints();
		gbc_section.anchor = GridBagConstraints.NORTHEAST;
		gbc_section.insets = new Insets(0, 0, 5, 5);
		gbc_section.gridx = 6;
		gbc_section.gridy = 4;
		panel.add(section, gbc_section);
		section.setFont(new Font("Dialog", Font.PLAIN, 19));
		section.setAlignment(Label.RIGHT);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{section, project, requirementName}));
		
		textFieldcreatedate = new JTextField();
		GridBagConstraints gbc_textFieldcreatedate = new GridBagConstraints();
		gbc_textFieldcreatedate.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldcreatedate.fill = GridBagConstraints.BOTH;
		gbc_textFieldcreatedate.gridx = 5;
		gbc_textFieldcreatedate.gridy = 5;
		panel.add(textFieldcreatedate, gbc_textFieldcreatedate);
		textFieldcreatedate.setColumns(10);
		
		JLabel createDate = new JLabel("\u062A\u0627\u0631\u06CC\u062E \u062F\u0631\u062E\u0648\u0627\u0633\u062A :");
		createDate.setFont(new Font("Dialog", Font.PLAIN, 19));
		GridBagConstraints gbc_createDate = new GridBagConstraints();
		gbc_createDate.anchor = GridBagConstraints.EAST;
		gbc_createDate.insets = new Insets(0, 0, 5, 5);
		gbc_createDate.gridx = 6;
		gbc_createDate.gridy = 5;
		panel.add(createDate, gbc_createDate);
		
		JButton regReq = new JButton("\u062B\u0628\u062A \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC");
		regReq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				create(textFieldres , textFieldcount ,textFieldproject, textFieldsection  , textFieldcreatedate);
				//SuccessUI ns = new SuccessUI();
				//ns.newScreen();
			}
		});
		GridBagConstraints gbc_regReq = new GridBagConstraints();
		gbc_regReq.anchor = GridBagConstraints.NORTH;
		gbc_regReq.insets = new Insets(0, 0, 5, 5);
		gbc_regReq.gridwidth = 2;
		gbc_regReq.gridx = 2;
		gbc_regReq.gridy = 7;
		panel.add(regReq, gbc_regReq);
	}

	protected void create(JTextField textFieldres2, JTextField textFieldcount2, JTextField textFieldproject2,
			JTextField textFieldsection2, JTextField textFieldcreatedate2) {
		// TODO Auto-generated method stub
		this.physicalRequirement=new PhysicalRequirement(textFieldres2.getText() , Integer.parseInt(textFieldcount2.getText()), textFieldproject2.getText() , textFieldsection2.getText(),  textFieldcreatedate2.getText());
		physicalRequirement.addRequirement();
		
	}
	
}

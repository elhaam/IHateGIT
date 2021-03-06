package UI;

import java.awt.EventQueue;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

import DB.Driver;
//import DevelopmentMaintanance.Module;
import DevelopmentMaintanance.Module;
import ResourceManagment.FinancialResource;
import ResourceManagment.HumanResource;
import ResourceManagment.InformationalResource;
import ResourceManagment.PhysicalResource;
import distributing.FinancialRequirement;
import distributing.PhysicalBusyResource;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import DB.Driver;
//import DevelopmentMaintanance.Module;
import net.proteanit.sql.DbUtils;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Physicalassign {
	//private JFrame frame;
	//private JTextField textFieldName;
	public Module module;
	//public Driver db;
	public ResultSet all; 
	//public ResultSet allResource;
	String physicalrequirement;
	public int kk,ll,ii,jj;
	public ArrayList<PhysicalResource> physicalres;
	//public Object physicalrequirement,hum,fin,inf,project;
	public ArrayList<HumanResource> humanres;
	public ArrayList<FinancialResource> financialres;
	public ArrayList<InformationalResource> informationalres;
	

	private JFrame frame;
	//private JFrame frame;
	private JTextField textFieldName;
	private JTable table;
	private JTable table_2;
	//public Module module;
	public Driver db;
	public ResultSet allProject; 
	public ResultSet allResource;
	//public JComboBox comboBoxProject;
	private JTable tableHuman;
	private JTable table_1;
	private JTextField textFieldid;
	private JTextField textFieldassignDate;
	private PhysicalBusyResource physicalBusyResource;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Physicalassign window = new Physicalassign();
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
	public Physicalassign() {
		db=new Driver();
		initialize();
	}
	private void fillTable(JTable table,String TableName) {
		// TODO Auto-generated method stub
		allResource=db.getAllRows(TableName);
		try{
			table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			table.setModel(DbUtils.resultSetToTableModel(allResource));
			allResource.close();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 614, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton loadphysical = new JButton("\u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC \u0641\u06CC\u0632\u06CC\u06A9\u06CC");
		loadphysical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				// ResultSet getAllRows(String physicalrequirement){}
					 
					
				fillTable(table_1, "physicalrequirement");	
				//Driver driver = new Driver();
				//ResultSet res1  = driver.getAllRows( physicalrequirement);
					
				}
					
			
		});
		
		JButton loadhuman = new JButton("\u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC \u0627\u0646\u0633\u0627\u0646\u06CC");
		loadhuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fillTable(table_1, "humanrequirement");
				
			}
		});
		loadhuman.setBounds(309, 34, 128, 23);
		frame.getContentPane().add(loadhuman);
		loadphysical.setBounds(447, 34, 128, 23);
		frame.getContentPane().add(loadphysical);
		
		JButton loadfinancial = new JButton("\u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC \u0645\u0627\u0644\u06CC");
		loadfinancial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fillTable(table_1, "financialrequirement");
				
			}
		});
		loadfinancial.setBounds(171, 34, 128, 23);
		frame.getContentPane().add(loadfinancial);
		
		JButton loadinformational = new JButton("\u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC \u0627\u0637\u0644\u0627\u0639\u0627\u062A\u06CC");
		loadinformational.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				fillTable(table_1, "informationalrequirement");
			}
		});
		loadinformational.setBounds(33, 34, 128, 23);
		frame.getContentPane().add(loadinformational);
		
		JButton assignbutton = new JButton("\u062A\u062E\u0635\u06CC\u0635 \u0645\u0646\u0628\u0639");
		assignbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				create(textFieldid,textFieldassignDate);
			}
		});
		assignbutton.setBounds(39, 367, 149, 23);
		frame.getContentPane().add(assignbutton);
		
		JLabel lblNewLabel = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC: ");
		lblNewLabel.setBounds(475, 374, 101, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldid = new JTextField();
		textFieldid.setBounds(376, 368, 86, 20);
		frame.getContentPane().add(textFieldid);
		textFieldid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u062A\u0627\u0631\u06CC\u062E \u0627\u062E\u062A\u0635\u0627\u0635 :");
		lblNewLabel_1.setBounds(489, 409, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFieldassignDate = new JTextField();
		textFieldassignDate.setBounds(377, 403, 86, 20);
		frame.getContentPane().add(textFieldassignDate);
		textFieldassignDate.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 93, 546, 263);
		frame.getContentPane().add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
	}

	protected void create(JTextField textFieldid2, JTextField textFieldassignDate2) {
		// TODO Auto-generated method stub
		this.physicalBusyResource=new PhysicalBusyResource(textFieldassignDate2.getText(),  Integer.parseInt(textFieldid2.getText()));
		//physicalBusyResource.add();
	}
}

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
		frame.setBounds(100, 100, 614, 442);
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
		
		JButton Button = new JButton("New button");
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fillTable(table_1, "humanrequirement");
				
			}
		});
		Button.setBounds(306, 34, 89, 23);
		frame.getContentPane().add(Button);
		loadphysical.setBounds(447, 34, 128, 23);
		frame.getContentPane().add(loadphysical);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 93, 514, 263);
		frame.getContentPane().add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
	}
}

package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import DevelopmentMaintanance.Module;
import net.proteanit.sql.DbUtils;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class createModule {

	private JFrame frame;
	private JTextField textFieldName;
	private JTable table;
	private JTable table_2;
	public Module module;
	public Driver db;
	public ResultSet allProject; 
	public ResultSet allResource;
	public JComboBox comboBoxProject;
	private JTable tableHuman;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createModule window = new createModule();
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
	public createModule() {
		db=new Driver();
		
		initialize();
	}

	private void fillComboBox() {
		// TODO Auto-generated method stub
		
		allProject=db.getAllRows("project");
		try {
			while(allProject.next()){
				
				comboBoxProject.addItem(allProject.getString("name"));
				
			}
			allProject.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		frame.setBounds(100, 100, 755, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel choose = new JPanel();
		frame.getContentPane().add(choose, "name_27785320742114");
		choose.setLayout(null);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(127, 46, 113, 20);
		choose.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel label = new JLabel("\u0646\u0627\u0645 \u0645\u0627\u0698\u0648\u0644:");
		label.setBounds(286, 49, 46, 14);
		choose.add(label);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u067E\u0631\u0648\u0698\u0647:");
		label_1.setBounds(286, 101, 46, 14);
		choose.add(label_1);
		
		comboBoxProject = new JComboBox();
		comboBoxProject.setBounds(127, 98, 113, 20);
		choose.add(comboBoxProject);
		System.out.println("first");
		fillComboBox();
		System.out.println("last");
		
		
		
		
		JLabel label_2 = new JLabel("\u0646\u0648\u0639 \u0627\u06CC\u062C\u0627\u062F \u06A9\u0646\u0646\u062F\u0647:");
		label_2.setBounds(286, 156, 70, 14);
		choose.add(label_2);
		
		JPanel group = new JPanel();
		frame.getContentPane().add(group, "name_27785336076539");
		group.setLayout(null);
		
		JPanel fard = new JPanel();
		frame.getContentPane().add(fard, "name_27785350484429");
		fard.setLayout(null);
		
		JRadioButton fardbutton = new JRadioButton("\u0641\u0631\u062F");
		fardbutton.setBounds(200, 152, 70, 23);
		choose.add(fardbutton);
		
		JRadioButton groupbutton = new JRadioButton("\u06AF\u0631\u0648\u0647");
		groupbutton.setBounds(112, 152, 86, 23);
		choose.add(groupbutton);
		
		JButton button = new JButton("\u0627\u062F\u0627\u0645\u0647 \u062F\u0631\u06CC\u0627\u0641\u062A \u0627\u0637\u0644\u0627\u0639\u0627\u062A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//module=new Module()
				
				if(fardbutton.isSelected()){
					choose.setVisible(false);
					fard.setVisible(true);
				}
				else if(groupbutton.isSelected()){
					choose.setVisible(false);
					group.setVisible(true);
				}
			}
		});
		button.setBounds(47, 211, 129, 23);
		choose.add(button);
		
		
		
		JLabel label_5 = new JLabel("\u0632\u0645\u0627\u0646 \u0645\u0635\u0631\u0641\u06CC:");
		label_5.setBounds(247, 21, 63, 14);
		group.add(label_5);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(169, 18, 42, 20);
		group.add(spinner_1);
		
		JLabel label_6 = new JLabel("\u0633\u0627\u0639\u062A");
		label_6.setBounds(101, 21, 46, 14);
		group.add(label_6);
		
		JLabel label_7 = new JLabel("\u062A\u0639\u062F\u0627\u062F \u0627\u0641\u0631\u0627\u062F:");
		label_7.setBounds(546, 24, 63, 14);
		group.add(label_7);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(483, 21, 42, 20);
		group.add(spinner_2);
		
		JLabel label_8 = new JLabel("\u0646\u0641\u0631");
		label_8.setBounds(438, 24, 35, 14);
		group.add(label_8);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(74, 66, 662, 156);
		group.add(scrollPane_1);
		
		JPanel panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		panel_1.setBorder(new TitledBorder(null, "\u0645\u0646\u0627\u0628\u0639 \u0627\u0646\u0633\u0627\u0646\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(47, 47, 603, 96);
		panel_1.add(scrollPane);
		
		tableHuman = new JTable();
		scrollPane.setViewportView(tableHuman);
		tableHuman.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		fillTable(tableHuman, "human-resource");
		System.out.println("before");
		System.out.println("after");
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0645\u0646\u0627\u0628\u0639 \u0645\u0635\u0631\u0641\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(139, 220, 590, 103);
		group.add(panel_2);
		
		table_2 = new JTable();
		table_2.setBounds(179, 29, -167, 145);
		panel_2.add(table_2);
		
		JButton gmodulebutt = new JButton("\u062B\u0628\u062A \u0645\u0627\u0698\u0648\u0644");
		gmodulebutt.setBounds(21, 272, 89, 23);
		group.add(gmodulebutt);
		
		
		
		JLabel label_3 = new JLabel("\u0632\u0645\u0627\u0646 \u0645\u0635\u0631\u0641\u06CC:");
		label_3.setBounds(124, 21, 79, 14);
		fard.add(label_3);
		
		JLabel label_4 = new JLabel("\u0633\u0627\u0639\u062A");
		label_4.setBounds(25, 21, 46, 14);
		fard.add(label_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(68, 18, 46, 20);
		fard.add(spinner);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u0645\u0646\u0627\u0628\u0639 \u0645\u0635\u0631\u0641\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(25, 49, 383, 202);
		fard.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(355, 24, -346, 167);
		panel.add(table);
		
		JButton fmoduleBut = new JButton("\u062B\u0628\u062A \u0645\u0627\u0698\u0648\u0644");
		fmoduleBut.setBounds(25, 272, 89, 23);
		fard.add(fmoduleBut);
		
		JLabel label_9 = new JLabel("\u0627\u06CC\u062C\u0627\u062F \u06A9\u0646\u0646\u062F\u0647:");
		label_9.setBounds(348, 21, 60, 14);
		fard.add(label_9);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(213, 18, 125, 20);
		fard.add(comboBox_1);
	}
}

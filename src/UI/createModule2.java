package UI;

import java.awt.EventQueue;

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
import DevelopmentMaintanance.Module;
import ResourceManagment.*;
//import net.proteanit.sql.DbUtils;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class createModule2 {

	private JFrame frame;
	private JTextField textFieldName;
	public Module module;
	public Driver db;
	public ResultSet all; 
	public ResultSet allResource;
	public JComboBox comboBoxProject;
	public int kk,ll,ii,jj;
	public ArrayList<PhysicalResource> physicalres;
	public Object phy,hum,fin,inf,project;
	public ArrayList<HumanResource> humanres;
	public ArrayList<FinancialResource> financialres;
	public ArrayList<InformationalResource> informationalres;
	
	/**
	 * 
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createModule2 window = new createModule2();
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
	public createModule2() {
		db=new Driver();

		initialize();
	}

	private Object fillComboBox(JComboBox comboBox,String tablename,String... id) {
		// TODO Auto-generated method stub
		
		all=db.getAllRows(tablename);
		try {
			
			if(id.length >1){
				while(all.next()){
					int i=0;
					System.out.println(tablename+":  "+all.getString(id[i++])+" "+all.getString(id[i]));
					 i=0;
					comboBox.addItem(all.getString(id[i++])+" "+all.getString(id[i]));
				}
			}

			else{
				int j=0;
				while(all.next()){
					System.out.println(tablename+":  "+all.getString(id[j]));
					comboBox.addItem(all.getString(id[j]));
				}
			}
			
			all.close();
			return comboBox.getSelectedItem();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	private void fillTable(JTable table,String TableName) {
		// TODO Auto-generated method stub
		allResource=db.getAllRows(TableName);
		try{
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
		frame.setTitle("\u062B\u0628\u062A \u0641\u0631\u0622\u06CC\u0646\u062F \u0627\u06CC\u062C\u0627\u062F");
		frame.setBounds(100, 100, 755, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		JPanel choose = new JPanel();
		frame.getContentPane().add(choose, "name_27785320742114");
		choose.setLayout(null);

		textFieldName = new JTextField();
		textFieldName.setBounds(327, 59, 113, 20);
		choose.add(textFieldName);
		textFieldName.setColumns(10);

		JLabel label = new JLabel("\u0646\u0627\u0645 \u0645\u0627\u0698\u0648\u0644:");
		label.setBounds(486, 62, 46, 14);
		choose.add(label);

		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u067E\u0631\u0648\u0698\u0647:");
		label_1.setBounds(479, 115, 46, 14);
		choose.add(label_1);

		comboBoxProject = new JComboBox();
		comboBoxProject.setBounds(327, 111, 113, 20);
		choose.add(comboBoxProject);
		
		project=fillComboBox(comboBoxProject,"project","name");
		

		JLabel label_2 = new JLabel("\u0646\u0648\u0639 \u0627\u06CC\u062C\u0627\u062F \u06A9\u0646\u0646\u062F\u0647:");
		label_2.setBounds(479, 170, 70, 14);
		choose.add(label_2);

		JPanel group = new JPanel();
		frame.getContentPane().add(group, "name_27785336076539");
		group.setLayout(null);

		JPanel fard = new JPanel();
		frame.getContentPane().add(fard, "name_27785350484429");
		fard.setLayout(null);
		
		JLabel label_3 = new JLabel("\u0632\u0645\u0627\u0646 \u0645\u0635\u0631\u0641\u06CC:");
		label_3.setBounds(601, 25, 63, 14);
		fard.add(label_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(519, 22, 42, 20);
		fard.add(spinner);
		
		JLabel label_4 = new JLabel("\u0633\u0627\u0639\u062A");
		label_4.setBounds(463, 25, 46, 14);
		fard.add(label_4);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 61, 328, 103);
		fard.add(scrollPane_4);
		
		JPanel panel = new JPanel();
		scrollPane_4.setViewportView(panel);
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0645\u0646\u0627\u0628\u0639 \u0641\u06CC\u0632\u06CC\u06A9\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton buttonPhy = new JButton("\u0627\u0636\u0627\u0641\u0647 \u06A9\u0631\u062F\u0646");
		buttonPhy.setBounds(25, 26, 89, 23);
		panel.add(buttonPhy);
		
		JComboBox comboBoxPhyF = new JComboBox();
		comboBoxPhyF.setBounds(153, 27, 145, 20);
		panel.add(comboBoxPhyF);
		fillComboBox(comboBoxPhyF,"physical-resource","no");
		buttonPhy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int count=1;
				ll +=25;
				addMore(panel,count,153, ll, 145, 20,"physical-resource","no");
			}
		});
		
		JButton fmodulebutt = new JButton("\u062B\u0628\u062A \u0645\u0627\u0698\u0648\u0644");
		fmodulebutt.setBounds(10, 306, 89, 23);
		fard.add(fmodulebutt);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(348, 62, 345, 103);
		fard.add(scrollPane_5);
		
		JPanel panel_5 = new JPanel();
		scrollPane_5.setViewportView(panel_5);
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0645\u0646\u0627\u0628\u0639 \u0627\u0646\u0633\u0627\u0646\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JComboBox comboBoxHumF = new JComboBox();
		comboBoxHumF.setBounds(170, 22, 145, 20);
		panel_5.add(comboBoxHumF);
		fillComboBox(comboBoxHumF,"human-resource","firstname","lastname");
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(349, 186, 344, 103);
		fard.add(scrollPane_6);
		
		JPanel panel_6 = new JPanel();
		scrollPane_6.setViewportView(panel_6);
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0645\u0646\u0627\u0628\u0639 \u0627\u0637\u0644\u0627\u0639\u0627\u062A\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton buttonInf = new JButton("\u0627\u0636\u0627\u0641\u0647 \u06A9\u0631\u062F\u0646");
		buttonInf.setBounds(29, 25, 89, 23);
		panel_6.add(buttonInf);
		
		JComboBox comboBoxInfoF = new JComboBox();
		comboBoxInfoF.setBounds(168, 26, 145, 20);
		panel_6.add(comboBoxInfoF);
		jj=26;
		fillComboBox(comboBoxInfoF,"informational-resource", "no");
		buttonInf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int count=1;
				jj+=25;
				addMore(panel_6,count,168,jj,145,20,"informational-resource", "no");
			}
		});
		
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(10, 186, 328, 103);
		fard.add(scrollPane_7);
		
		JPanel panel_7 = new JPanel();
		scrollPane_7.setViewportView(panel_7);
		panel_7.setLayout(null);
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0645\u0646\u0627\u0628\u0639 \u0645\u0627\u0644\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton buttonFin = new JButton("\u0627\u0636\u0627\u0641\u0647 \u06A9\u0631\u062F\u0646");
		buttonFin.setBounds(23, 27, 89, 23);
		panel_7.add(buttonFin);
		
		JComboBox comboBoxFinF = new JComboBox();
		comboBoxFinF.setBounds(152, 28, 145, 20);
		panel_7.add(comboBoxFinF);
		kk=28;
		fillComboBox(comboBoxFinF,"financial-resource-budget", "accountno");
		buttonFin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int count=1;
				kk +=25;
				addMore(panel_7,count,152,kk,145,20,"financial-resource-budget", "accountno");
			}
		});
		

		JRadioButton fardbutton = new JRadioButton("\u0641\u0631\u062F");
		fardbutton.setBounds(393, 166, 70, 23);
		choose.add(fardbutton);

		JRadioButton groupbutton = new JRadioButton("\u06AF\u0631\u0648\u0647");
		groupbutton.setBounds(305, 166, 86, 23);
		choose.add(groupbutton);

		JButton button = new JButton("\u0627\u062F\u0627\u0645\u0647 \u062F\u0631\u06CC\u0627\u0641\u062A \u0627\u0637\u0644\u0627\u0639\u0627\u062A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//module=new Module()

				if(fardbutton.isSelected()){
					choose.setVisible(false);
					fard.setVisible(true);
					ResultSet rs=db.getARow("project", "name",project.toString() );
					try {
						//System.out.println("projectttttt:"+rs.getString("name"));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//module=new Module(textFieldName.getText(),rs.,false);
				}
				else if(groupbutton.isSelected()){
					choose.setVisible(false);
					group.setVisible(true);
					//module=new Module(textFieldName.getText(),project.toString(),true);
				}
				
			}
		});
		button.setBounds(240, 225, 129, 23);
		choose.add(button);



		JLabel label_5 = new JLabel("\u0632\u0645\u0627\u0646 \u0645\u0635\u0631\u0641\u06CC:");
		label_5.setBounds(612, 32, 63, 14);
		group.add(label_5);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(530, 29, 42, 20);
		group.add(spinner_1);

		JLabel label_6 = new JLabel("\u0633\u0627\u0639\u062A");
		label_6.setBounds(474, 32, 46, 14);
		group.add(label_6);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(21, 68, 328, 103);
		group.add(scrollPane_3);
		
		JPanel panel_2 = new JPanel();
		scrollPane_3.setViewportView(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0645\u0646\u0627\u0628\u0639 \u0641\u06CC\u0632\u06CC\u06A9\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JButton addButPhys = new JButton("\u0627\u0636\u0627\u0641\u0647 \u06A9\u0631\u062F\u0646");
		
		addButPhys.setBounds(25, 26, 89, 23);
		panel_2.add(addButPhys);

		JComboBox comboPhys = new JComboBox();
		comboPhys.setBounds(153, 27, 145, 20);
		panel_2.add(comboPhys);
		ll=27;
		fillComboBox(comboPhys,"physical-resource","no");
		addButPhys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int count=1;
				ll +=25;
				addMore(panel_2,count,153, ll, 145, 20,"physical-resource","no");
			}
		});
		

		JButton gmodulebutt = new JButton("\u062B\u0628\u062A \u0645\u0627\u0698\u0648\u0644");
		gmodulebutt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	Module module=new Module(textFieldName.getText(), comboBoxProject.getSelectedItem().toString(),);
				
			}
		});
		gmodulebutt.setBounds(21, 313, 89, 23);
		group.add(gmodulebutt);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(359, 69, 345, 103);
		group.add(scrollPane_2);

		JPanel panel_1 = new JPanel();
		scrollPane_2.setViewportView(panel_1);
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0645\u0646\u0627\u0628\u0639 \u0627\u0646\u0633\u0627\u0646\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JButton addButHuman = new JButton("\u0627\u0636\u0627\u0641\u0647 \u06A9\u0631\u062F\u0646\r\n");
		
		addButHuman.setBounds(33, 21, 89, 23);
		panel_1.add(addButHuman);

		JComboBox comboHum = new JComboBox();
		comboHum.setBounds(170, 22, 145, 20);
		panel_1.add(comboHum);
		fillComboBox(comboHum,"human-resource","firstname","lastname");
		addButHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int count=0;
				ii +=25;
				hum=addMore(panel_1,count,170, ii, 145, 20,"human-resource","firstname","lastname");
				//humanres
			}
		});
		ii=22;
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(360, 193, 344, 103);
		group.add(scrollPane_1);
		
		

		JPanel panel_3 = new JPanel();
		scrollPane_1.setViewportView(panel_3);
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0645\u0646\u0627\u0628\u0639 \u0627\u0637\u0644\u0627\u0639\u0627\u062A\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JButton addButInfo = new JButton("\u0627\u0636\u0627\u0641\u0647 \u06A9\u0631\u062F\u0646");
		
		addButInfo.setBounds(29, 25, 89, 23);
		panel_3.add(addButInfo);
		JComboBox comboInfo = new JComboBox();
		comboInfo.setBounds(168, 26, 145, 20);
		
		panel_3.add(comboInfo);
		jj=26;
		fillComboBox(comboInfo,"informational-resource", "no");
		addButInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int count=1;
				jj+=25;
				addMore(panel_3,count,168,jj,145,20,"informational-resource", "no");
			}
		});
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 193, 328, 103);
		group.add(scrollPane);
		

		JPanel panel_4 = new JPanel();
		scrollPane.setViewportView(panel_4);
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0645\u0646\u0627\u0628\u0639 \u0645\u0627\u0644\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JButton addButFinan = new JButton("\u0627\u0636\u0627\u0641\u0647 \u06A9\u0631\u062F\u0646");
		
		addButFinan.setBounds(23, 27, 89, 23);
		panel_4.add(addButFinan);

		JComboBox comboFin = new JComboBox();
		comboFin.setBounds(152, 28, 145, 20);
		panel_4.add(comboFin);
		kk=28;
		fillComboBox(comboFin,"financial-resource-budget", "accountno");
		addButFinan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int count=1;
				kk +=25;
				addMore(panel_4,count,152,kk,145,20,"financial-resource-budget", "accountno");
			}
		});
		
	}

	protected Object addMore(JPanel panel,int count,int i, int j , int k, int l,String tablename,String... args ) {
		// TODO Auto-generated method stub
		 JComboBox newbox = new JComboBox();
		 newbox.setBounds(i, j, k, l);
         newbox.setName("combo" + count );
         count++;
         panel.add(newbox);
         return fillComboBox(newbox,tablename, args);

	}
}

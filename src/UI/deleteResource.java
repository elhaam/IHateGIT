package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import ResourceManagment.PhysicalResource;

import javax.swing.JButton;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import DB.*;

public class deleteResource {

	private JFrame frame;
	private Driver db=new Driver();
	public ResultSet all;
	public boolean ismelk=false; 


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deleteResource window = new deleteResource();
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
	public deleteResource() {
		initialize();
	}

	private void fillComboBox(JComboBox comboBox,String tablename,String... id) {
		// TODO Auto-generated method stub

		System.out.println(tablename);
		ResultSet all=db.getAllRows(tablename);
		System.out.println(all);
		try {
			int j=0;
			while(all.next()){
				System.out.println(tablename+":  "+all.getString(id[j]));
				comboBox.addItem(all.getString(id[j]));
			}
			all.close();
			//return comboBox.getSelectedItem().toString();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		//return null;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u062D\u0630\u0641 \u0645\u0646\u0628\u0639");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.getContentPane().add(panel, "name_497449773117585");

		JLabel label = new JLabel("\u0627\u0646\u062A\u062E\u0627\u0628 \u0646\u0648\u0639 \u0645\u0646\u0628\u0639:");
		label.setBounds(279, 34, 83, 14);
		panel.add(label);

		JRadioButton phyisRadButton = new JRadioButton("\u0641\u06CC\u0632\u06CC\u06A9\u06CC");
		phyisRadButton.setBounds(253, 91, 109, 23);
		panel.add(phyisRadButton);

		JRadioButton finanRadButton = new JRadioButton("\u0645\u0627\u0644\u06CC");
		finanRadButton.setBounds(253, 133, 109, 23);
		panel.add(finanRadButton);

		JRadioButton humRadButton = new JRadioButton("\u0627\u0646\u0633\u0627\u0646\u06CC");
		humRadButton.setBounds(98, 91, 109, 23);
		panel.add(humRadButton);

		JRadioButton infoRadButton = new JRadioButton("\u0627\u0637\u0644\u0627\u0639\u0627\u062A\u06CC");
		infoRadButton.setBounds(98, 133, 109, 23);
		panel.add(infoRadButton);

		JButton cont = new JButton("\u0627\u062F\u0627\u0645\u0647 ");

		cont.setBounds(39, 208, 89, 23);
		panel.add(cont);

		JPanel panelPhy = new JPanel();
		frame.getContentPane().add(panelPhy, "name_497458676937363");
		panelPhy.setLayout(null);

		JLabel label_1 = new JLabel("\u0627\u0646\u062A\u062E\u0627\u0628 \u0645\u0646\u0628\u0639 \u0628\u0631\u0627\u06CC \u062D\u0630\u0641:");
		label_1.setBounds(246, 55, 138, 14);
		panelPhy.add(label_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(149, 103, 171, 20);
		panelPhy.add(comboBox);
		fillComboBox(comboBox,"physical-resource","no");

		JButton button = new JButton("\u062D\u0630\u0641 \u0645\u0646\u0628\u0639");


		button.setBounds(67, 182, 89, 23);
		panelPhy.add(button);

		JPanel panelHum = new JPanel();
		frame.getContentPane().add(panelHum, "name_497491280276461");
		panelHum.setLayout(null);

		JLabel label_2 = new JLabel("\u0627\u0646\u062A\u062E\u0627\u0628 \u0645\u0646\u0628\u0639 \u0628\u0631\u0627\u06CC \u062D\u0630\u0641:");
		label_2.setBounds(230, 49, 138, 14);
		panelHum.add(label_2);

		JComboBox comboBoxHum = new JComboBox();
		comboBoxHum.setBounds(133, 97, 171, 20);
		panelHum.add(comboBoxHum);
		fillComboBox(comboBoxHum,"human-resource","employeeid");

		JButton button_1 = new JButton("\u062D\u0630\u0641 \u0645\u0646\u0628\u0639");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				db.delete("human-resource","employeeid",comboBoxHum.getSelectedItem().toString());
			}
		});
		button_1.setBounds(51, 176, 89, 23);
		panelHum.add(button_1);

		JPanel panelInfo = new JPanel();
		frame.getContentPane().add(panelInfo, "name_497508756138012");
		panelInfo.setLayout(null);

		JLabel label_3 = new JLabel("\u0627\u0646\u062A\u062E\u0627\u0628 \u0645\u0646\u0628\u0639 \u0628\u0631\u0627\u06CC \u062D\u0630\u0641:");
		label_3.setBounds(238, 52, 138, 14);
		panelInfo.add(label_3);

		JComboBox comboBoxInfo = new JComboBox();
		comboBoxInfo.setBounds(141, 100, 171, 20);
		panelInfo.add(comboBoxInfo);
		fillComboBox(comboBoxInfo,"informational-resource","no");

		JButton button_2 = new JButton("\u062D\u0630\u0641 \u0645\u0646\u0628\u0639");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				db.delete("Informational-resource","no",comboBoxInfo.getSelectedItem().toString());
			}
		});
		button_2.setBounds(59, 179, 89, 23);
		panelInfo.add(button_2);

		JPanel panelFin = new JPanel();
		frame.getContentPane().add(panelFin, "name_497522781813248");
		panelFin.setLayout(null);

		JLabel label_4 = new JLabel("\u0627\u0646\u062A\u062E\u0627\u0628 \u0645\u0646\u0628\u0639 \u0628\u0631\u0627\u06CC \u062D\u0630\u0641:");
		label_4.setBounds(240, 51, 138, 14);
		panelFin.add(label_4);

		JComboBox comboBoxFin = new JComboBox();
		comboBoxFin.setBounds(143, 99, 171, 20);
		panelFin.add(comboBoxFin);
		fillComboBox(comboBoxFin,"financial-resource-melk","id");
		fillComboBox(comboBoxFin,"financial-resource-budget","accountno");

		JButton button_3 = new JButton("\u062D\u0630\u0641 \u0645\u0646\u0628\u0639");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBoxFin.getSelectedIndex()>= db.countObject("financial-resource-melk"))
					db.delete("financial-resource-budget","accountno",comboBoxFin.getSelectedItem().toString());
				else
					db.delete("financial-resource-melk","id",comboBoxFin.getSelectedItem().toString());
			}
		});
		button_3.setBounds(61, 178, 89, 23);
		panelFin.add(button_3);

		cont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(phyisRadButton.isSelected()){
					panel.setVisible(false);
					panelPhy.setVisible(true);

				}
				else if(finanRadButton.isSelected()){
					panel.setVisible(false);
					panelFin.setVisible(true);

				}
				else if(humRadButton.isSelected()){
					panel.setVisible(false);
					panelHum.setVisible(true);
				}
				else if(infoRadButton.isSelected()){
					panel.setVisible(false);
					panelInfo.setVisible(true);

				}
				//else show window error
				//frame.dispose();
			}
		});

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				db.delete("physical-resource","no",comboBox.getSelectedItem().toString());
			}
		});
	}
}

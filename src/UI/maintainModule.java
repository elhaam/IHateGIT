package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.CardLayout;

public class maintainModule {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maintainModule window = new maintainModule();
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
	public maintainModule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel choose = new JPanel();
		frame.getContentPane().add(choose, "name_82149318572536");
		choose.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(130, 53, 113, 20);
		textField.setColumns(10);
		choose.add(textField);
		
		JLabel label = new JLabel("\u0646\u0627\u0645 \u0645\u0627\u0698\u0648\u0644:");
		label.setBounds(289, 56, 46, 14);
		choose.add(label);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u067E\u0631\u0648\u0698\u0647:");
		label_1.setBounds(289, 108, 46, 14);
		choose.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(130, 105, 113, 20);
		choose.add(comboBox);
		
		JLabel label_2 = new JLabel("\u0646\u0648\u0639 \u0646\u06AF\u0647\u062F\u0627\u0631\u06CC \u06A9\u0646\u0646\u062F\u0647::");
		label_2.setBounds(289, 163, 70, 14);
		choose.add(label_2);
		
		JRadioButton radioButton = new JRadioButton("\u0641\u0631\u062F");
		radioButton.setBounds(203, 159, 70, 23);
		choose.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u06AF\u0631\u0648\u0647");
		radioButton_1.setBounds(115, 159, 86, 23);
		choose.add(radioButton_1);
		
		JButton button = new JButton("\u0627\u062F\u0627\u0645\u0647 \u062F\u0631\u06CC\u0627\u0641\u062A \u0627\u0637\u0644\u0627\u0639\u0627\u062A");
		button.setBounds(50, 218, 129, 23);
		choose.add(button);
		
		JPanel group = new JPanel();
		frame.getContentPane().add(group, "name_82149333530928");
		group.setLayout(null);
		
		JLabel label_3 = new JLabel("\u0632\u0645\u0627\u0646 \u0645\u0635\u0631\u0641\u06CC:");
		label_3.setBounds(141, 14, 63, 14);
		group.add(label_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(90, 11, 42, 20);
		group.add(spinner);
		
		JLabel label_4 = new JLabel("\u0633\u0627\u0639\u062A");
		label_4.setBounds(34, 14, 46, 14);
		group.add(label_4);
		
		JLabel label_5 = new JLabel("\u062A\u0639\u062F\u0627\u062F \u0627\u0641\u0631\u0627\u062F:");
		label_5.setBounds(348, 14, 63, 14);
		group.add(label_5);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(296, 11, 42, 20);
		group.add(spinner_1);
		
		JLabel label_6 = new JLabel("\u0646\u0641\u0631");
		label_6.setBounds(250, 14, 35, 14);
		group.add(label_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "\u0645\u0646\u0627\u0628\u0639 \u0627\u0646\u0633\u0627\u0646\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(221, 56, 190, 185);
		group.add(panel_3);
		
		table = new JTable();
		table.setBounds(179, 28, -164, 132);
		panel_3.add(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0645\u0646\u0627\u0628\u0639 \u0645\u0635\u0631\u0641\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(21, 56, 190, 185);
		group.add(panel_4);
		
		table_1 = new JTable();
		table_1.setBounds(179, 29, -167, 145);
		panel_4.add(table_1);
		
		JButton button_1 = new JButton("\u0646\u06AF\u0647\u062F\u0627\u0631\u06CC \u0645\u0627\u0698\u0648\u0644");
		button_1.setBounds(21, 262, 111, 23);
		group.add(button_1);
		
		JPanel fard = new JPanel();
		frame.getContentPane().add(fard, "name_82149343398508");
		fard.setLayout(null);
		
		JLabel label_7 = new JLabel("\u0632\u0645\u0627\u0646 \u0645\u0635\u0631\u0641\u06CC:");
		label_7.setBounds(124, 14, 79, 14);
		fard.add(label_7);
		
		JLabel label_8 = new JLabel("\u0633\u0627\u0639\u062A");
		label_8.setBounds(25, 14, 46, 14);
		fard.add(label_8);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(68, 11, 46, 20);
		fard.add(spinner_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(null, "\u0645\u0646\u0627\u0628\u0639 \u0645\u0635\u0631\u0641\u06CC", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(10, 42, 414, 202);
		fard.add(panel_5);
		
		table_2 = new JTable();
		table_2.setBounds(355, 24, -346, 167);
		panel_5.add(table_2);
		
		JButton button_2 = new JButton("\u0646\u06AF\u0647\u062F\u0627\u0631\u06CC \u0645\u0627\u0698\u0648\u0644");
		button_2.setBounds(25, 265, 105, 23);
		fard.add(button_2);
		
		JLabel label_9 = new JLabel("\u0646\u06AF\u0647\u062F\u0627\u0631\u06CC \u06A9\u0646\u0646\u062F\u0647:");
		label_9.setBounds(348, 14, 76, 14);
		fard.add(label_9);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(213, 11, 125, 20);
		fard.add(comboBox_1);
	}
}

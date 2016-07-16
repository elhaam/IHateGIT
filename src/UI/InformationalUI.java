package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import ResourceManagment.InformationalResource;

import java.awt.Component;
import java.awt.CardLayout;
import javax.swing.JTextField;

public class InformationalUI {

	private JFrame f;
	private JLabel lblNewLabel;
	private JTextField name;
	private JTextField No;
	private JTextField createDate;
	private JTextField format;
	private JTextField subcategory;
	private JTextField subcategory2;
	private JTextField format2;
	private JTextField createDate2;
	private JTextField No2;
	private JTextField name2;
	private JTextField categoty;
	public InformationalResource informationalResource;

	/**
	 * Launch the application.
	 */
	public void showInformationalUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformationalUI window = new InformationalUI();
					window.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InformationalUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		f = new JFrame();
		f.setBounds(100, 100, 497, 385);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel chooseType = new JPanel();
		f.getContentPane().add(chooseType, "name_96051781831796");
		chooseType.setLayout(null);
		
		JLabel label = new JLabel("\u0646\u0648\u0639 \u0645\u0646\u0628\u0639 \u0627\u0637\u0644\u0627\u0639\u0627\u062A\u06CC  \u062E\u0648\u062F \u0631\u0627 \u0628\u0631\u0627\u06CC \u062B\u0628\u062A \u0627\u0646\u062A\u062E\u0627\u0628 \u06A9\u0646\u06CC\u062F:");
		label.setBounds(171, 49, 238, 14);
		chooseType.add(label);
		
		JRadioButton directType = new JRadioButton("\u0645\u0633\u062A\u0642\u06CC\u0645");
		directType.setBounds(276, 86, 109, 23);
		chooseType.add(directType);
		
		JRadioButton indirectType = new JRadioButton("\u063A\u06CC\u0631 \u0645\u0633\u062A\u0642\u06CC\u0645");
		indirectType.setBounds(137, 86, 109, 23);
		chooseType.add(indirectType);
		
		
		JPanel direct = new JPanel();
		f.getContentPane().add(direct, "name_96051817129096");
		direct.setLayout(null);
		
		lblNewLabel = new JLabel("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0645\u0646\u0628\u0639 \u0627\u0637\u0644\u0627\u0639\u0627\u062A\u06CC \u0645\u0633\u062A\u0642\u06CC\u0645:");
		lblNewLabel.setBounds(167, 21, 175, 14);
		direct.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("\u0646\u0627\u0645:");
		label_2.setBounds(311, 59, 46, 14);
		direct.add(label_2);
		
		JLabel label_3 = new JLabel("\u0634\u0645\u0627\u0631\u0647:");
		label_3.setBounds(311, 102, 46, 14);
		direct.add(label_3);
		
		JLabel label_4 = new JLabel("\u062A\u0627\u0631\u06CC\u062E \u0627\u06CC\u062C\u0627\u062F:");
		label_4.setBounds(311, 139, 61, 14);
		direct.add(label_4);
		
		JLabel label_5 = new JLabel("\u0641\u0631\u0645\u062A:");
		label_5.setBounds(311, 185, 46, 14);
		direct.add(label_5);
		
		JLabel lblsubcategory = new JLabel("\u0632\u06CC\u0631\u0633\u0627\u0645\u0627\u0646\u0647 \u06CC \u0645\u0631\u0628\u0648\u0637\u0647(subcategory):");
		lblsubcategory.setBounds(272, 232, 164, 14);
		direct.add(lblsubcategory);
		
		name = new JTextField();
		name.setBounds(177, 56, 86, 20);
		direct.add(name);
		name.setColumns(10);
		
		No = new JTextField();
		No.setBounds(177, 99, 86, 20);
		direct.add(No);
		No.setColumns(10);
		
		createDate = new JTextField();
		createDate.setBounds(177, 136, 86, 20);
		direct.add(createDate);
		createDate.setColumns(10);
		
		format = new JTextField();
		format.setBounds(177, 182, 86, 20);
		direct.add(format);
		format.setColumns(10);
		
		subcategory = new JTextField();
		subcategory.setBounds(167, 229, 86, 20);
		direct.add(subcategory);
		subcategory.setColumns(10);
		
		
		JPanel indirect = new JPanel();
		f.getContentPane().add(indirect, "name_96051832879093");
		indirect.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0645\u0646\u0628\u0639 \u0627\u0637\u0644\u0627\u0639\u0627\u062A\u06CC \u063A\u06CC\u0631 \u0645\u0633\u062A\u0642\u06CC\u0645:");
		lblNewLabel_1.setBounds(154, 21, 171, 14);
		indirect.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0646\u0627\u0645:");
		lblNewLabel_2.setBounds(316, 61, 46, 14);
		indirect.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0634\u0645\u0627\u0631\u0647:");
		lblNewLabel_3.setBounds(316, 104, 46, 14);
		indirect.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u062A\u0627\u0631\u06CC\u062E \u0627\u06CC\u062C\u0627\u062F:");
		lblNewLabel_4.setBounds(316, 141, 61, 14);
		indirect.add(lblNewLabel_4);
		
		JLabel label_1 = new JLabel("\u0641\u0631\u0645\u062A:");
		label_1.setBounds(316, 187, 46, 14);
		indirect.add(label_1);
		
		JLabel label_6 = new JLabel("\u0632\u06CC\u0631\u0633\u0627\u0645\u0627\u0646\u0647 \u06CC \u0645\u0631\u0628\u0648\u0637\u0647(subcategory):");
		label_6.setBounds(275, 284, 164, 14);
		indirect.add(label_6);
		
		subcategory2 = new JTextField();
		subcategory2.setColumns(10);
		subcategory2.setBounds(165, 281, 86, 20);
		indirect.add(subcategory2);
		
		format2 = new JTextField();
		format2.setColumns(10);
		format2.setBounds(176, 182, 86, 20);
		indirect.add(format2);
		
		createDate2 = new JTextField();
		createDate2.setColumns(10);
		createDate2.setBounds(176, 136, 86, 20);
		indirect.add(createDate2);
		
		No2 = new JTextField();
		No2.setColumns(10);
		No2.setBounds(176, 99, 86, 20);
		indirect.add(No2);
		
		name2 = new JTextField();
		name2.setColumns(10);
		name2.setBounds(176, 56, 86, 20);
		indirect.add(name2);
		
		JLabel lblcategory = new JLabel("\u0633\u06CC\u0633\u062A\u0645 \u0627\u0637\u0644\u0627\u0639\u0627\u062A\u06CC \u0645\u0631\u0628\u0648\u0637\u0647(category):");
		lblcategory.setBounds(275, 239, 181, 14);
		indirect.add(lblcategory);
		
		categoty = new JTextField();
		categoty.setBounds(165, 236, 86, 20);
		indirect.add(categoty);
		categoty.setColumns(10);
/////////////////////////////////////////////continue button //////////////////////////////////////////
		
		JButton cont = new JButton("\u0627\u062F\u0627\u0645\u0647");
		cont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(indirectType.isSelected()){
					chooseType.setVisible(false);
					direct.setVisible(true);
				}
				else if(directType.isSelected()){
					chooseType.setVisible(false);
					indirect.setVisible(true);
				}
					
			}
		});
		cont.setBounds(46, 135, 89, 23);
		chooseType.add(cont);
		
		
		
/////////////////////////////////////////////create direct source//////////////////////////////////////////
		
		
		JButton button_1 = new JButton("\u062B\u0628\u062A \u0645\u0646\u0628\u0639");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				createDirect(name,No,createDate,format,subcategory);
			}

			
		});
		button_1.setBounds(36, 263, 89, 23);
		direct.add(button_1);
		direct.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel}));
		
/////////////////////////////////////////////create indirect source/////////////////////////////////////////
		
		
		
		JButton cont2 = new JButton("\u062B\u0628\u062A \u0645\u0646\u0628\u0639");
		cont2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				createIndirect(name2,No2,createDate2,format2,subcategory2,categoty);
			}
		});
		cont2.setBounds(33, 293, 89, 23);
		indirect.add(cont2);
		
		
	}
	protected void createIndirect(JTextField name22, JTextField no22, JTextField createDate22, JTextField format22, JTextField subcategory22, JTextField categoty2) {
		// TODO Auto-generated method stub
		this.informationalResource=new InformationalResource(name22.getText(), format22.getText(),
				createDate22.getText(), subcategory22.getText(), categoty2.getText(), Integer.parseInt(no22.getText()));
		informationalResource.addResource();
		
	}

	protected void createDirect(JTextField name3, JTextField no3, JTextField createDate3, JTextField format3, JTextField subcategory3) {
		// TODO Auto-generated method stub
		this.informationalResource=new InformationalResource(name3.getText(), format3.getText(),
				createDate3.getText(), subcategory3.getText(), Integer.parseInt(no3.getText()));
		informationalResource.addResource();
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}
	
}

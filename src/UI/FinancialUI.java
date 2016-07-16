package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;

import ResourceManagment.FinancialResource;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinancialUI {

	private JFrame frame;
	private JTextField textFieldarea;
	private JTextField textFieldowner;
	private JTextField textFieldcost;
	private JTextField textFieldaccountNo;
	private JTextField textFieldbank;
	private JTextField textFieldaccountowner;
	public FinancialResource financialResource;

	/**
	 * Launch the application.
	 */
	public void showFinancialUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinancialUI window = new FinancialUI();
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
	public FinancialUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 419, 294);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel chooseType = new JPanel();
		frame.getContentPane().add(chooseType, "name_100907048641241");
		chooseType.setLayout(null);
		
		JLabel label = new JLabel("\u0646\u0648\u0639 \u0645\u0646\u0628\u0639 \u0645\u0627\u0644\u06CC \u062E\u0648\u062F \u0631\u0627 \u0628\u0631\u0627\u06CC \u062B\u0628\u062A \u0627\u0646\u062A\u062E\u0627\u0628 \u06A9\u0646\u06CC\u062F:");
		label.setBounds(154, 45, 218, 14);
		chooseType.add(label);
		
		JRadioButton melkType = new JRadioButton("\u0645\u0644\u06A9");
		melkType.setBounds(141, 93, 65, 23);
		chooseType.add(melkType);
		
		JRadioButton budgetType = new JRadioButton("\u0628\u0648\u062F\u062C\u0647");
		budgetType.setBounds(259, 93, 85, 23);
		chooseType.add(budgetType);
		
		
		
		JPanel melk = new JPanel();
		frame.getContentPane().add(melk, "name_100907062988492");
		melk.setLayout(null);
		
		JPanel budget = new JPanel();
		frame.getContentPane().add(budget, "name_100907074636166");
		budget.setLayout(null);
		
		JLabel label_1 = new JLabel("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0645\u0646\u0628\u0639 \u0645\u0627\u0644\u06CC \u0645\u0644\u06A9:");
		label_1.setBounds(155, 29, 120, 14);
		melk.add(label_1);
		
		JLabel area = new JLabel("\u0645\u0633\u0627\u062D\u062A:");
		area.setBounds(272, 68, 46, 14);
		melk.add(area);
		
		JLabel cost = new JLabel("\u0642\u06CC\u0645\u062A:");
		cost.setBounds(272, 108, 46, 14);
		melk.add(cost);
		
		JLabel owner = new JLabel("\u0645\u0627\u0644\u06A9:");
		owner.setBounds(272, 148, 46, 14);
		melk.add(owner);
		
		JLabel address = new JLabel("\u0622\u062F\u0631\u0633:");
		address.setBounds(272, 194, 46, 14);
		melk.add(address);
		
		textFieldarea = new JTextField();
		textFieldarea.setBounds(143, 65, 86, 20);
		melk.add(textFieldarea);
		textFieldarea.setColumns(10);
		
		JTextArea textAdress = new JTextArea();
		textAdress.setBounds(122, 189, 107, 40);
		melk.add(textAdress);
		
		textFieldowner = new JTextField();
		textFieldowner.setBounds(143, 145, 86, 20);
		melk.add(textFieldowner);
		textFieldowner.setColumns(10);
		
		textFieldcost = new JTextField();
		textFieldcost.setBounds(143, 105, 86, 20);
		melk.add(textFieldcost);
		textFieldcost.setColumns(10);
		
		JButton button = new JButton("\u0627\u062F\u0627\u0645\u0647");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(melkType.isSelected()){
					chooseType.setVisible(false);
					melk.setVisible(true);
				}
				else if(budgetType.isSelected()){
					chooseType.setVisible(false);
					budget.setVisible(true);
				}
			}
		});
		button.setBounds(59, 157, 70, 23);
		chooseType.add(button);
		
		JButton contMelk = new JButton("\u062B\u0628\u062A \u0645\u0646\u0628\u0639");
		contMelk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				createMelk(textFieldarea,textFieldcost,textFieldowner,textAdress);
			}
		});
		contMelk.setBounds(23, 222, 89, 23);
		melk.add(contMelk);
		
		
		
		JLabel label_3 = new JLabel("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0645\u0646\u0628\u0639 \u0645\u0627\u0644\u06CC \u0628\u0648\u062F\u062C\u0647 :");
		label_3.setBounds(142, 29, 132, 14);
		budget.add(label_3);
		
		JLabel label_4 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u062D\u0633\u0627\u0628:");
		label_4.setBounds(259, 68, 74, 14);
		budget.add(label_4);
		
		textFieldaccountNo = new JTextField();
		textFieldaccountNo.setColumns(10);
		textFieldaccountNo.setBounds(130, 65, 86, 20);
		budget.add(textFieldaccountNo);
		
		textFieldbank = new JTextField();
		textFieldbank.setColumns(10);
		textFieldbank.setBounds(130, 105, 86, 20);
		budget.add(textFieldbank);
		
		JLabel label_5 = new JLabel("\u0628\u0627\u0646\u06A9:");
		label_5.setBounds(259, 108, 46, 14);
		budget.add(label_5);
		
		JLabel label_6 = new JLabel("\u0646\u0627\u0645 \u0635\u0627\u062D\u0628 \u062D\u0633\u0627\u0628:");
		label_6.setBounds(259, 148, 95, 14);
		budget.add(label_6);
		
		textFieldaccountowner = new JTextField();
		textFieldaccountowner.setColumns(10);
		textFieldaccountowner.setBounds(130, 145, 86, 20);
		budget.add(textFieldaccountowner);
		
		JButton contBudget = new JButton("\u062B\u0628\u062A \u0645\u0646\u0628\u0639");
		contBudget.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				createBudget(textFieldbank,textFieldaccountNo,textFieldaccountowner);
			}
		});
		contBudget.setBounds(53, 200, 89, 23);
		budget.add(contBudget);
	}

	protected void createBudget(JTextField textFieldbank2, JTextField textFieldaccountNo2,
			JTextField textFieldaccountowner2) {
		// TODO Auto-generated method stubh
		this.financialResource=new FinancialResource(textFieldbank2.getText(), textFieldaccountowner2.getText(), Integer.parseInt(textFieldaccountNo2.getText()));
		financialResource.addResource();
	
		
	}

	protected void createMelk(JTextField textFieldarea2, JTextField textFieldcost2, JTextField textFieldowner2,
			JTextArea textAdress) {
		// TODO Auto-generated method stub
		this.financialResource=new FinancialResource(Integer.parseInt(textFieldarea2.getText()), Integer.parseInt(textFieldcost2.getText()), textFieldowner2.getText(), textAdress.getText());
		financialResource.addResource();
		
	}
}

package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import Forecast.Forecast;

import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Estimate {

	private JFrame frame;
	private JTextField textField;
	public int count=0;
	public ArrayList<String> arrayTfield=new ArrayList<String>();
	public static int ii=153;
	

	/**
	 * Launch the application.
	 */
	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estimate window = new Estimate();
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
	public Estimate() {
		
		initialize();
		
	}
	protected void addMore(JPanel panel,int i, int j , int k, int l ) {
		// TODO Auto-generated method stub
		 JTextField newtext = new JTextField();
		 newtext.setBounds(i, j, k, l);
         //newtext.setName("tx" + count );
         count++;
         arrayTfield.add(newtext.getText());
        // System.out.println(""newtext.getText());
         panel.add(newtext);
         System.out.println("new text added");
        
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u062A\u062E\u0645\u06CC\u0646 \u0645\u0646\u0627\u0628\u0639");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_86826730700911");
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u0627\u0646\u062F\u0627\u0632\u0647 \u06CC \u0633\u0627\u0645\u0627\u0646\u0647 \u06CC \u0646\u0631\u0645 \u0627\u0641\u0632\u0627\u0631\u06CC:");
		label.setBounds(226, 46, 157, 14);
		panel.add(label);
		
		JSpinner spinnerHum = new JSpinner();
		spinnerHum.setBounds(209, 71, 29, 20);
		panel.add(spinnerHum);
		
		JLabel label_1 = new JLabel("\u062A\u06A9\u0646\u0648\u0644\u0648\u0698\u06CC \u0647\u0627\u06CC \u0645\u0646\u062A\u062E\u0628:");
		label_1.setBounds(266, 156, 102, 14);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(155, 153, 101, 20);
		panel.add(textField);
		textField.setColumns(10);
		//arrayTfield.add()
		
		
		JButton button = new JButton("\u0627\u0636\u0627\u0641\u0647 \u06A9\u0631\u062F\u0646");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
					ii=ii+25;
					System.out.println("addmore");
				 addMore(panel,155,ii,101,20);
			}
		});
		button.setBounds(48, 152, 89, 23);
		panel.add(button);
		
		JLabel lblNewLabel = new JLabel("\u0633\u0627\u06CC\u0632 \u0627\u0646\u0633\u0627\u0646\u06CC:");
		lblNewLabel.setBounds(266, 71, 68, 14);
		panel.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("\u0633\u0627\u06CC\u0632 \u062A\u06A9\u0646\u06CC\u06A9\u06CC:");
		label_2.setBounds(266, 110, 77, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u0646\u0641\u0631");
		label_3.setBounds(155, 74, 46, 14);
		panel.add(label_3);
		
		JSpinner spinnerModule = new JSpinner();
		spinnerModule.setBounds(209, 107, 29, 20);
		panel.add(spinnerModule);
		
		JLabel label_4 = new JLabel("\u0645\u0627\u0698\u0648\u0644");
		label_4.setBounds(153, 110, 46, 14);
		panel.add(label_4);
		
		JButton button_1 = new JButton("\u062A\u062E\u0645\u06CC\u0646 \u0645\u0646\u0627\u0628\u0639");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int peopleNum= (Integer) spinnerHum.getValue();			
				int moduleNum= (Integer) spinnerModule.getValue();
				Forecast fc=new Forecast(peopleNum,moduleNum,arrayTfield);
				fc.estimate();
				//textField
			}
		});
		button_1.setBounds(48, 211, 89, 23);
		panel.add(button_1);
		
		
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "name_86830926283181");
	}
}

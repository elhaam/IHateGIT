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
import java.awt.event.ActionEvent;

public class ResourceUI {

	private JFrame frame;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResourceUI window = new ResourceUI();
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
	public ResourceUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(panel);
		
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
		cont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(phyisRadButton.isSelected()){
				
					PhysicalUI prui=new PhysicalUI();
					prui.showPhysicalUI();
					
				}
				else if(finanRadButton.isSelected()){
					FinancialUI fiui=new FinancialUI();
					fiui.showFinancialUI();
					
				}
				else if(humRadButton.isSelected()){
					HumanUI huui=new HumanUI();
					huui.showHumanUI();
				
				}
				else if(infoRadButton.isSelected()){
					InformationalUI inui=new InformationalUI();
					inui.showInformationalUI();
					
				}
				//else show window error
				frame.dispose();
			}
		});
		cont.setBounds(39, 208, 89, 23);
		panel.add(cont);
	}
}

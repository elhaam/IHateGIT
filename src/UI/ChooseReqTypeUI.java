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

public class ChooseReqTypeUI {

	private JFrame frame;


	/**
	 * Launch the application.
	 */
	public void showChooseReqTypeUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseReqTypeUI window = new ChooseReqTypeUI();
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
	public ChooseReqTypeUI() {
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
		
		JLabel label = new JLabel("\u0627\u0646\u062A\u062E\u0627\u0628 \u0646\u0648\u0639 \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC:");
		label.setBounds(219, 34, 143, 14);
		panel.add(label);
		
		JRadioButton phyisRadButton_1 = new JRadioButton("\u0641\u06CC\u0632\u06CC\u06A9\u06CC");
		phyisRadButton_1.setBounds(253, 91, 109, 23);
		panel.add(phyisRadButton_1);
		
		JRadioButton finanRadButton_1 = new JRadioButton("\u0645\u0627\u0644\u06CC");
		finanRadButton_1.setBounds(253, 133, 109, 23);
		panel.add(finanRadButton_1);
		
		JRadioButton humRadButton_1 = new JRadioButton("\u0627\u0646\u0633\u0627\u0646\u06CC");
		humRadButton_1.setBounds(98, 91, 109, 23);
		panel.add(humRadButton_1);
		
		JRadioButton infoRadButton_1 = new JRadioButton("\u0627\u0637\u0644\u0627\u0639\u0627\u062A\u06CC");
		infoRadButton_1.setBounds(98, 133, 109, 23);
		panel.add(infoRadButton_1);
		
		JButton contin = new JButton("\u0627\u062F\u0627\u0645\u0647 ");
		contin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(phyisRadButton_1.isSelected()){
				
					RegPhysicalRequirement pu=new RegPhysicalRequirement();
					pu.showRegPhysicalRequirement();
					
				}
				else if(finanRadButton_1.isSelected()){
					RegFinanRequirement fu=new RegFinanRequirement();
					fu.showRegFinanRequirement();
					
				}
				else if(humRadButton_1.isSelected()){
					RegHumanRequirement huui=new RegHumanRequirement();
					huui.showRegHumanRequirement();
				
				}
				else if(infoRadButton_1.isSelected()){
					RegInfoRequirement inui=new RegInfoRequirement ();
					inui.showRegInfoRequirement();
					
				}
				//else show window error
				frame.dispose();
			}
		});
		contin.setBounds(39, 208, 89, 23);
		panel.add(contin);
	}
}


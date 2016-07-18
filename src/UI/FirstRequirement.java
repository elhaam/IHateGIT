package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
/*
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
*/
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Box;

public class FirstRequirement {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstRequirement window = new FirstRequirement();
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
	public FirstRequirement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 424, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 240, 240));
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"\u0645\u062F\u06CC\u0631\u06CC\u062A \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_2);

		JButton registerReq = new JButton("\u062B\u0628\u062A \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC");
		registerReq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                 // //  if(registerReq.isSelected()){
                    	ChooseReqTypeUI chreq =new ChooseReqTypeUI ();
					chreq.showChooseReqTypeUI();
					
				//}
			}
		});
		registerReq.setBounds(159, 200, 109, 23);

		JButton editRec = new JButton(
				"\u0648\u06CC\u0631\u0627\u06CC\u0634 \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC");
		editRec.setBounds(159, 127, 109, 23);
		editRec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_2.setLayout(null);
		panel_2.add(registerReq);

		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(144, 32, 0, 0);
		panel_2.add(verticalBox);
		panel_2.add(editRec);

		JButton deleteRec = new JButton("\u062D\u0630\u0641 \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC");
		deleteRec.setBounds(159, 55, 109, 23);
		deleteRec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_2.add(deleteRec);
	}

}

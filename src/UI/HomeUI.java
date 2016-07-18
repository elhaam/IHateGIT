package UI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JToolBar;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class HomeUI {

	private JFrame frmClass;
	protected int index;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeUI window = new HomeUI();
					window.frmClass.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClass = new JFrame();
		frmClass.setTitle("\u062E\u0627\u0646\u0647");
		frmClass.setBounds(0, 20, 571, 269);
		frmClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClass.getContentPane().setLayout(null);

		JLabel label = new JLabel("\u062E\u0648\u0634 \u0622\u0645\u062F\u06CC\u062F \u0645\u062F\u06CC\u0631!");
		label.setBounds(455, 11, 90, 14);
		frmClass.getContentPane().add(label);

		//********************** combo_user ****************************//
		JComboBox combo_user = new JComboBox();
		combo_user.setToolTipText("");
		combo_user.setModel(new DefaultComboBoxModel(new String[] {"--\u0627\u0645\u0648\u0631 \u06A9\u0627\u0631\u0628\u0631\u06CC--", "\u0645\u0634\u0627\u0647\u062F\u0647 \u067E\u0631\u0648\u0641\u0627\u06CC\u0644 \u0634\u062E\u0635\u06CC", "\u0648\u06CC\u0631\u0627\u06CC\u0634 \u067E\u0631\u0648\u0641\u0627\u06CC\u0644 \u0634\u062E\u0635\u06CC", "\u062A\u0627\u0626\u06CC\u062F \u062B\u0628\u062A\u200C\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631 (\u0645\u062F\u06CC\u0631)", "\u062B\u0628\u062A\u200C\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631 (\u0645\u062F\u06CC\u0631)", "\u062E\u0631\u0648\u062C"}));
		combo_user.setBounds(421, 69, 124, 20);
		frmClass.getContentPane().add(combo_user);
		combo_user.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				index = combo_user.getSelectedIndex();
				if (index == 1 || index == 2 || index ==3) {
					frmClass.dispose();
					if (index == 1) {
						System.out.println("PROFILE");
						ProfileUI s = new ProfileUI();
						s.newScreen();
					}
					if (index == 2) {
						System.out.println("PROFILE EDIT");
						ProfileEditUI s = new ProfileEditUI();
						s.newScreen();
					}
					if (index == 3) {
						System.out.println("TAEED");
						VerifyUserUI s = new VerifyUserUI();
						s.newScreen();
					}
					if (index == 4) {
						System.out.println("SABTE NAM");
						RegUserUI s = new RegUserUI();
						s.newScreen();
					}
					if (index == 5) {
						System.out.println("EXIT");
						ExistingReportUI s = new ExistingReportUI();
						s.newScreen();
					}
				}
			}
		});


		//********************** combo_requirement ****************************//
		JComboBox combo_requirement = new JComboBox();
		combo_requirement.setModel(new DefaultComboBoxModel(new String[] {"--\u0645\u062F\u06CC\u0631\u06CC\u062A \u0645\u0646\u0627\u0628\u0639--", "\u062B\u0628\u062A \u0645\u0646\u0628\u0639", "\u062D\u0630\u0641 \u0645\u0646\u0628\u0639", "\u0648\u06CC\u0631\u0627\u06CC\u0634 \u0645\u0646\u0628\u0639"}));
		combo_requirement.setBounds(230, 69, 124, 20);
		frmClass.getContentPane().add(combo_requirement);

		combo_requirement.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				index = combo_requirement.getSelectedIndex();
				if (index == 1) {
					System.out.println("REGISTER");
					ResourceUI ru=new ResourceUI();
					ru.showResourceUI();
				}
				if (index == 2) {
					System.out.println("DELETE");
					deleteResource dr=new deleteResource();
					dr.main();
				}
				if (index == 3) {
					System.out.println("EDIT");
					editResource er=new editResource();
					er.main();
				}
			}
		});

		
		//********************** combo_maintain ****************************//
		JComboBox combo_maintain = new JComboBox();
		combo_maintain.setModel(new DefaultComboBoxModel(new String[] {"--\u062A\u0648\u0644\u06CC\u062F \u0648 \u0646\u06AF\u0647\u062F\u0627\u0631\u06CC \u0645\u0627\u0698\u0648\u0644--", "\u062B\u0628\u062A \u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0627\u06CC\u062C\u0627\u062F ", "\u062B\u0628\u062A \u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0646\u06AF\u0647\u062F\u0627\u0631\u06CC"}));
		combo_maintain.setBounds(39, 69, 139, 20);
		frmClass.getContentPane().add(combo_maintain);

		combo_maintain.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				index = combo_maintain.getSelectedIndex();
				if (index == 1) {
					System.out.println("CREATION REGISTER");
					createModule2 cr= new createModule2();
					cr.main();
							
				}
				if (index == 2) {
					System.out.println("MAINNTAIN REGISTTER");
					maintainModule mm=new maintainModule();
					mm.main();
				}
			}
		});

		
		//********************** combo_distribution ****************************//
		JComboBox combo_distribute = new JComboBox();
		combo_distribute.setMaximumRowCount(10);
		combo_distribute.setModel(new DefaultComboBoxModel(new String[] {"--\u062A\u0648\u0632\u06CC\u0639--", "\u062B\u0628\u062A \u0627\u0637\u0644\u0627\u0639\u0627\u062A \u067E\u0631\u0648\u0698\u0647", "\u062B\u0628\u062A \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC", "\u062D\u0630\u0641 \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC", "\u0648\u06CC\u0631\u0627\u06CC\u0634 \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC", "\u0627\u062E\u062A\u0635\u0627\u0635 \u0645\u0646\u0628\u0639", "\u062B\u0628\u062A \u0645\u0634\u062E\u0635\u0627\u062A \u0645\u0646\u0627\u0628\u0639 \u062F\u0631 \u062D\u0627\u0644 \u0627\u0633\u062A\u0641\u0627\u062F\u0647", "\u0622\u0632\u0627\u062F\u0633\u0627\u0632\u06CC \u0645\u0646\u0627\u0628\u0639", "\u0648\u06CC\u0631\u0627\u06CC\u0634 \u0627\u0637\u0644\u0627\u0639\u0627\u062A \u067E\u0631\u0648\u0698\u0647"}));
		combo_distribute.setBounds(421, 164, 124, 20);
		frmClass.getContentPane().add(combo_distribute);

		combo_distribute.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				index = combo_distribute.getSelectedIndex();
				if (index == 1) {
					System.out.println("DISTRIBUTE 1");
				}
				if (index == 2) {
					System.out.println("DISTRIBUTE 2");
				}
				if (index == 3) {
					System.out.println("DISTRIBUTE 3");
				}
				if (index == 4) {
					System.out.println("DISTRIBUTE 4");
				}
				if (index == 5) {
					System.out.println("DISTRIBUTE 5");
				}
				if (index == 6) {
					System.out.println("DISTRIBUTE 6");
				}
				if (index == 7) {
					System.out.println("DISTRIBUTE 7");
				}
				if (index == 8) {
					System.out.println("DISTRIBUTE 8");
				}
			}
		});

		
		//********************** combo_forcast ****************************//
		JComboBox combo_forcast = new JComboBox();
		combo_forcast.setModel(new DefaultComboBoxModel(new String[] {"--\u067E\u06CC\u0634\u200C\u0628\u06CC\u0646\u06CC--", "\u062A\u062E\u0645\u06CC\u0646 \u0645\u0646\u0627\u0628\u0639", "\u06CC\u0627\u0641\u062A\u0646 \u0646\u06CC\u0627\u0632\u0645\u0646\u062F\u06CC\u200C\u0647\u0627\u06CC \u0636\u0631\u0648\u0631\u06CC"}));
		combo_forcast.setBounds(230, 164, 124, 20);
		frmClass.getContentPane().add(combo_forcast);

		combo_forcast.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				index = combo_forcast.getSelectedIndex();
				if (index == 1) {
					System.out.println("FORCAST 1");
					Estimate es=new Estimate();
					es.main();
				}
				if (index == 2) {
					System.out.println("FORCAST 2");
				}
			}
		});

		
		//********************** combo_report ****************************//
		JComboBox combo_report = new JComboBox();
		combo_report.setModel(new DefaultComboBoxModel(new String[] {"--\u06AF\u0632\u0627\u0631\u0634--", "\u06AF\u0632\u0627\u0631\u0634 \u0645\u0646\u0627\u0628\u0639 \u0645\u0648\u062C\u0648\u062F", "\u06AF\u0632\u0627\u0631\u0634 \u062C\u0631\u06CC\u0627\u0646 \u0686\u0631\u062E\u0634\u06CC \u0645\u0635\u0631\u0641", "\u06AF\u0632\u0627\u0631\u0634 \u0645\u0646\u0627\u0628\u0639 \u0645\u0648\u0631\u062F \u0646\u06CC\u0627\u0632 \u067E\u0631\u0648\u0698\u0647\u200C\u0647\u0627"}));
		combo_report.setBounds(39, 164, 139, 20);
		frmClass.getContentPane().add(combo_report);

		combo_report.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// index of the selected option
				index = combo_report.getSelectedIndex();
				if (index == 1 || index == 2 || index ==3) {
					frmClass.dispose();
					// First option is selected
					if (index == 1) {
						System.out.println("REPORT 1");
						ExistingReportUI s = new ExistingReportUI();
						s.newScreen();
					}
					// Second option is selected
					if (index == 2) {
						System.out.println("REPORT 2");
						CyclicReportUI s = new CyclicReportUI();
						s.newScreen();
					}
					// Third option is selected
					if (index == 3) {
						System.out.println("REPORT 3");
						NeededReportUI s = new NeededReportUI();
						s.newScreen();
					}
				}
			}
		});
	}


	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

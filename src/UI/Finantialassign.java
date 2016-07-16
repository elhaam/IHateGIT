package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import com.mysql.jdbc.Connection;

import DB.Driver;
import DevelopmentMaintanance.Module;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.sql.*;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Finantialassign {
	private JFrame frame;
	private JTextField textFieldName;
	private JTable table;
	private JTable table_2;
	public Module module;
	public Driver db;
	public ResultSet allProject; 
	public ResultSet allResource;
	public JComboBox comboBoxProject;
	private JTable tableHuman;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finantialassign window = new Finantialassign();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		Connection connection = null;
	/**
	 * Create the application.
	 */
	public Finantialassign() {
		db=new Driver();
		//connection = Driver.driver;
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void fillTable(JTable table,String TableName) {
		// TODO Auto-generated method stub
		allResource=db.getAllRows(TableName);
		try{
			table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			table.setModel(DbUtils.resultSetToTableModel(allResource));
			allResource.close();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 653, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Financial = new JButton("New button");
		Financial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				//String financialrequirement  = "select * from financialrequirement ";
					//	ResultSet pst = db.getAllRows(financialrequirement);
				//ResultSet rs = statement.executeQuery();
				//table.setModel(DbUtils.resultSetToTableModel(rs));
					fillTable(table, "financialrequirement");
			}
				catch (Exception e1){
					e1.printStackTrace();}
				
				
		}
		});
		Financial.setBounds(512, 11, 89, 23);
		frame.getContentPane().add(Financial);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(102, 64, 499, 159);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}

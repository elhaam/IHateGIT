package distributing;
import DB.DataSource;
import DB.Driver;

import java.util.ArrayList;

import javax.management.loading.PrivateClassLoader;

public class Requirement {
	public static Driver db=new Driver();
/*
	private String requirementName;
	private String section;
	private String createDate;
	private String projectName;
	private String User;
	private int count;
	//private String assignDate;
	 * 
	 */
	
/*
		this.requirementName=n;
		this.section=s;
		this.count = c;
		this.createDate=cd;
		this.projectName = p ;
		//this.assignDate = ad;
		 
		 */
	public void CreateRequirement(String n,String s,String cd ,String ad){
		 ArrayList<String> requirement = new ArrayList<String>();
		
	};
	public void EditRequirement(){};
	public void addRequirement(){
	  	//db.insert("physical-resource",this.No,this.type,this.modelName);	
	}
	
	
}

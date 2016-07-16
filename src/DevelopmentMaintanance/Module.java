package DevelopmentMaintanance;

import java.util.ArrayList;

import DB.Driver;
import ResourceManagment.HumanResource;
import ResourceManagment.Resource;
import distributing.Project;

public class Module {
	Project project;
	String name;
	int time;
	ArrayList<HumanResource> developers;
	boolean isGroup=false;
	ArrayList<Resource> usedResource;
	public ArrayList<Object> humanres;
	public ArrayList<Object> infores;
	public ArrayList<Object> physres;
	public ArrayList<Object> finanres;
	public Driver db;
	
	public Module(String name,String project,boolean g){ //,int time,ArrayList<String> dev,boolean b,ArrayList<Resource> r){
		//this.project=project;
		this.name=name;
		db=new Driver();
		this.isGroup=g;
//		this.time=time;
//		this.developers=dev;
//		this.isGroup=b;
//		this.usedResource=r;
	}
	
	public void addModule(){
		db.insert("module", this.name,this.project);
//		db.insert("informational-resource-module",);
//		db.insert("physical-resource-module",);
//		db.insert("human-resource-module",);
//		db.insert("bank-resource-module",);
//		
	}
	public void createModule(){
		
	}
	public void maintainModule(){
		
	}
	
	
}

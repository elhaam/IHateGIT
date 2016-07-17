package DevelopmentMaintanance;

import java.util.ArrayList;

import javax.swing.JComboBox;

import DB.Driver;
import ResourceManagment.HumanResource;
import ResourceManagment.Resource;
import distributing.Project;

public class Module {
	//Project project;
	String project;
	String name;
	int timeCreate=0;
	int timeMaintain=0;
	ArrayList<HumanResource> developers;
	boolean isGroup=false;
	ArrayList<Resource> usedResource;
	public ArrayList<JComboBox> humanres;
	public ArrayList<JComboBox> infores;
	public ArrayList<JComboBox> physres;
	public ArrayList<JComboBox> finanres;
	public Driver db=new Driver();
	
	public Module(String name,String project,boolean g,int timecreate,int timemaintain,ArrayList<JComboBox> h,ArrayList<JComboBox> i,ArrayList<JComboBox> p,ArrayList<JComboBox> f){ //,int time,ArrayList<String> dev,boolean b,ArrayList<Resource> r){
		this.project=project;
		this.name=name;
		this.isGroup=g;
		this.timeCreate=timecreate;
		this.timeMaintain=timemaintain;
		this.humanres=h;
		this.infores=i;
		this.physres=p;
		this.finanres=f;
		System.out.println("module created:)))))))))"+project+" "+name);
		
	}
	
	public void addModule(){
		db.insert("module", this.name,this.project,this.timeCreate,this.timeMaintain);
		System.out.println();
//		db.insert("informational-resource-module",);
//		db.insert("physical-resource-module",);
//		db.insert("human-resource-module",);
//		db.insert("bank-resource-module",);
//		
	}
	public void createModule(){
		for(int i=0;i<this.humanres.size();i++){
			db.insert("human-resource-module", this.name,this.humanres.get(i).getSelectedItem().toString(),"create");
		}
		
		for(int i=0;i<this.infores.size();i++){
			db.insert("inforamtional-resource-module", this.name,this.infores.get(i).getSelectedItem().toString(),"create");
		}
		
		for(int i=0;i<this.finanres.size();i++){
			db.insert("bank-resource-module", this.name,this.finanres.get(i).getSelectedItem().toString(),"create");
		}
		
		for(int i=0;i<this.physres.size();i++){
			db.insert("physical-resource-module", this.name,this.physres.get(i).getSelectedItem().toString(),"create");
		}
		
	}
	public void maintainModule(){
		for(int i=0;i<this.humanres.size();i++){
			db.insert("human-resource-module", this.name,this.humanres.get(i).getSelectedItem().toString(),"create");
		}
		
		for(int i=0;i<this.infores.size();i++){
			db.insert("inforamtional-resource-module", this.name,this.infores.get(i).getSelectedItem().toString(),"create");
		}
		
		for(int i=0;i<this.finanres.size();i++){
			db.insert("bank-resource-module", this.name,this.finanres.get(i).getSelectedItem().toString(),"create");
		}
		
		for(int i=0;i<this.physres.size();i++){
			db.insert("physical-resource-module", this.name,this.physres.get(i).getSelectedItem().toString(),"create");
		}
	}
	
	
}

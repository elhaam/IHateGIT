package User;

import ResourceManagment.HumanResource;
import ResourceManagment.Job;
import ResourceManagment.Subsystem;

public class User extends HumanResource {
	String passText;
	private int employeeid;

	public User(String f, String l, int m, int e, String s, Job j, Subsystem sub, String p, 
			int isMiddle, int isEmployee) {
		super(f, l, m, e, s, j, sub);
		passText = p;
		employeeid = e;
		isEmployee = 0;
		isMiddle = 0;
	}

	public void addUser(){
		db.insert("human-resource",this.employeeid);	
	}

	public String getPassword() {
		return passText;
	}

	public void setPassword(String password) {
		this.passText = password;
	}

}

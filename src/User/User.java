package User;

import ResourceManagment.HumanResource;
import ResourceManagment.Job;
import ResourceManagment.Subsystem;

public class User extends HumanResource {
	String passText;
	private int employeeid;

	public User(String f, String l, int m, int e, String s, Job j, Subsystem sub, String p, 
			Boolean ismiddle, Boolean ismanager) {
		super(f, l, m, e, s, j, sub);
		passText = p;
		employeeid = e;
		ismanager = false;
		ismiddle = false;

		// TODO Auto-generated constructor stub
	}

	public void addUser(){
		db.insert("user",this.employeeid);	
		// TODO set foreign key
	}

	public String getPassword() {
		return passText;
	}

	public void setPassword(String password) {
		this.passText = password;
	}

}

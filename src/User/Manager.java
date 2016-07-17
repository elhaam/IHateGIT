package User;

import ResourceManagment.Job;
import ResourceManagment.Subsystem;

public class Manager extends User {

	private Object employeeid;

	public Manager(String f, String l, int m, int e, String start, 
			Job job, Subsystem sub, String pw) {
		super(f, l, m, e, start, job, sub, pw, 0, 1);
		employeeid = e;
	}

	public void addMiddleManager(){
		db.insert("user",this.employeeid);	
		// TODO set foreign key
	}
}

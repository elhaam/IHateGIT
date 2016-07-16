package distributing;
import DB.DataSource;
import DB.Driver;

import java.awt.List;

import ResourceManagment.Job;
import ResourceManagment.Resource;
import ResourceManagment.ResourceType;
import ResourceManagment.Subsystem;

public class  BusyResource {
	
	private String AssignDate;
	private String ReleaseDate;
	private String Resource;
	private String Section;
	private String Project;
	
	public String getReleaseDate()
	{
	    return this.ReleaseDate;
	}
	public void setReleaseDate(String rd)
	{
	     this.ReleaseDate= rd;
	}
	public String getAssignDate()
	{
	    return this.AssignDate;
	}
	public void setAssignDate(String ad)
	{
	     this.ReleaseDate= ad;
	}
	
	public void BusyResource (String ad) {
		
		this.AssignDate=ad;
		
	}
	
	public void assignResource( Resource res, Requirement req){
		
		
	};
	public void registerBusyResource(){};
	public void ReleasingResource(){};
	public void information(){};

}

package distributing;
import DB.DataSource;
import DB.Driver;
public class  Project{
	private String projectName;
	private int moduleCount;
	private int humanCount;
	private String technology;
	private String reason;
	private String startDate;
	public Driver db;
	
	//Job job;
	//Subsystem subsystem;
	
	public Project(String pr ,String tech ,int mc , int hc, String r, String SD ) {
		this.projectName = pr;
		this.technology = tech;
		this.moduleCount = mc;
		this.humanCount = hc;
		this.reason = r;
		this.startDate =SD;
		db=new Driver();
		
	}
	public void addProject(){
		db.insert("project", this.projectName,this.moduleCount 
				, this.humanCount , this.technology , this.reason 
				, this.startDate);}
	

}

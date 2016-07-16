package distributing;
import DB.DataSource;
import DB.Driver;
import ResourceManagment.Resource;
import ResourceManagment.ResourceType;
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
	
	public Project(String pr  ,int mc , int hc,String tech, String r, String SD ) {
		this.projectName = pr;
		this.humanCount = hc;
		this.moduleCount = mc;
		this.technology = tech;
		this.reason = r;
		this.startDate =SD;
		db=new Driver();
		
	}
	public void addProject(){
		db.insert("project", this.projectName,this.humanCount,this.moduleCount 
				,  this.technology , this.reason 
				, this.startDate);}
	

}
/////////////////////////////////////////////////////////////

	
	
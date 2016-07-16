package ResourceManagment;
import DB.DataSource;
import DB.Driver;


public class HumanResource extends Resource{
	
	public  String firstName;
	public String lastName;
	public int melliNo;
	public int employeeNo;
	public String StartDate;
	public Job job;
	public Subsystem subsystem;
	
	
	public HumanResource(String f,String l,int m, int e, String s,Job j,Subsystem sub) {
		super(ResourceType.HUMAN);
		this.firstName=f;
		this.lastName=l;
		this.melliNo=m;
		this.employeeNo=e;
		this.StartDate=s;
		this.job=j;
		this.subsystem=sub;		
		
	}
	
	
	public void addResource(){
	  	db.insert("human-resource",this.firstName,this.lastName,
    			this.melliNo,this.employeeNo,this.job.toString(),this.subsystem.toString(),this.StartDate);	
	}
	
	
	

}

package distributing;
import distributing.Requirement;

public class HumanRequirement extends Requirement {
	private String requirementName;
	private int count;
	private String projectName;
	private String section;
	private String createDate;
	private String assignDate;
	
	private String User;
	

	public HumanRequirement(String n, int c, String p, String s  , String cd) {

		this.requirementName=n;
		this.section=s;
		this.count = c;
		this.createDate=cd;
		this.projectName = p ;
		
		// TODO Auto-generated constructor stub
	}
	public HumanRequirement(String ad , String user) {
		this.assignDate=ad;
		this.User =user;
		
	}
	public void addRequirement(){
	  	db.insert("humanrequirement",this.requirementName , 
	  			this.projectName,
	  			this.count ,
	  			
	  	this.section ,
		this.createDate ,
		this.assignDate,
		this.User
		);	
	}
	

}

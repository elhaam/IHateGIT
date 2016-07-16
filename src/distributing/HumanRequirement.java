package distributing;
import distributing.Requirement;

public class HumanRequirement extends Requirement {
	private String requirementName;
	private String section;
	private String createDate;
	private String projectName;
	private String User;
	private int count;

	public HumanRequirement(String n, int c, String p, String s  , String cd) {

		this.requirementName=n;
		this.section=s;
		this.count = c;
		this.createDate=cd;
		this.projectName = p ;
		
		// TODO Auto-generated constructor stub
	}
	public void addRequirement(){
	  	db.insert("humanrequirement",this.requirementName , this.section ,
		this.count ,
		this.createDate ,
		this.projectName );	
	}
	

}

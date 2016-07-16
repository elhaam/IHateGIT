package distributing;

public class PhysicalRequirement extends Requirement {
	private String requirementName;
	
	private String createDate;
	private String projectName;
	private String section;
	private int count;
	//private String User;
	

	public PhysicalRequirement(String n, int c, String p, String s  , String cd) {
		// TODO Auto-generated constructor stub

		this.requirementName=n;
		this.count = c;
		this.projectName = p ;
		this.section=s;
		this.createDate=cd;
	}	
	public void addRequirement(){
	  	db.insert("physicalrequirement",this.requirementName ,
	  			this.count ,
	  			this.projectName ,
	  			this.section ,
	  			this.createDate);	
	}
	
}

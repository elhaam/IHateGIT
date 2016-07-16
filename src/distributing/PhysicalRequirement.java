package distributing;

public class PhysicalRequirement extends Requirement {
	private String requirementName;
	private String section;
	private String createDate;
	private String projectName;
	private String User;
	private int count;

	

	public PhysicalRequirement(String n, int c, String p, String s  , String cd) {
		// TODO Auto-generated constructor stub

		this.requirementName=n;
		this.section=s;
		this.count = c;
		this.createDate=cd;
		this.projectName = p ;
	}
	public void addRequirement(){
	  	db.insert("physicalrequirement",this.requirementName , this.count ,
	  			this.projectName ,
	  			this.section ,
	  			this.createDate);	
	}
	
}

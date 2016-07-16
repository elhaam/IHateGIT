package distributing;

public class InformationalRequirement extends Requirement {
	private String requirementName;
	private String projectName;
	private String section;
	private String createDate;
	
	private String User;


	public InformationalRequirement(String n, String p, String s  , String cd) {
		this.requirementName=n;
		this.projectName = p;
		this.section=s;
		this.createDate=cd;
		
	}

	public void addRequirement() {
		db.insert("informationalrequirement",this.requirementName ,
	  			this.projectName ,
	  			this.section ,
	  			this.createDate );
		
	
	

}
}
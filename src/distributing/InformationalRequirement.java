package distributing;

public class InformationalRequirement extends Requirement {
	private String requirementName;
	private String section;
	private String createDate;
	private String projectName;
	private String User;


	public InformationalRequirement(String n, String p, String s  , String cd) {
		this.requirementName=n;
		this.section=s;
		this.createDate=cd;
		this.projectName = p;
	}

	public void addRequirement() {
		db.insert("financialrequirement",this.requirementName ,
	  			this.projectName ,
	  			this.section ,
	  			this.createDate );
		
	
	

}
}
package distributing;

public class FinancialRequirement extends Requirement {
	private String requirementName;
	private int value;
	private String projectName;
	private String section;
	private String createDate;
	private String User;
	

	public FinancialRequirement(String n, int v, String p, String s  , String cd) {

		this.requirementName=n;
		this.value = v;
		this.projectName = p ;
		this.section=s;
		this.createDate=cd;
		
	}

	public void addRequirement() {
		db.insert("financialrequirement",this.requirementName , this.value ,
	  			this.projectName ,
	  			this.section ,
	  			this.createDate );
		
	}

}

package distributing;

public class FinancialRequirement extends Requirement {
	private String requirementName;
	private String section;
	private String createDate;
	private String projectName;
	private String User;
	private int value;

	public FinancialRequirement(String n, int v, String p, String s  , String cd) {

		this.requirementName=n;
		this.section=s;
		this.value = v;
		this.createDate=cd;
		this.projectName = p ;
	}

	public void addRequirement() {
		db.insert("financialrequirement",this.requirementName , this.value ,
	  			this.projectName ,
	  			this.section ,
	  			this.createDate );
		
	}

}

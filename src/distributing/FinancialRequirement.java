package distributing;

public class FinancialRequirement extends Requirement {
	private String requirementName;
	private int value;
	private String projectName;
	private String section;
	private String createDate;
	private String assigneDate;
	private String User;
	

	public FinancialRequirement(String n, int v, String p, String s  , String cd ) {

		this.requirementName=n;
		this.value = v;
		this.projectName = p ;
		this.section=s;
		this.createDate=cd;
		//this.assignDate=ad;
		
	}
	public FinancialRequirement(String ad) {
		this.assigneDate=ad;
		
	}

	public void addRequirement() {
		db.insert("financialrequirement",this.requirementName , this.value ,
	  			this.projectName ,
	  			this.section ,
	  			this.createDate,
	  			this.assigneDate );
		
	}

}

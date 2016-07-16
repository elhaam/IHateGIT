package ResourceManagment;

public class InformationalResource extends Resource {
	InformationType type;
	private String name;
	private String format;
	private String createDate;
	private int no;
	private String subcategory;
	private String category;
	public InformationalResource(String n,String f,String c,String s,int no) {
		super(ResourceType.INFORMATIONAL);
		// TODO Auto-generated constructor stub
		this.type=InformationType.DIRECT;
		this.name=n;
		this.format=f;
		this.createDate=c;
		this.subcategory=s;
		this.no=no;
	}
	public InformationalResource(String n,String f,String c,String s,String ca,int no) {
		super(ResourceType.INFORMATIONAL);
		// TODO Auto-generated constructor stub
		this.type=InformationType.INDIRECT;
		this.name=n;
		this.format=f;
		this.createDate=c;
		this.subcategory=s;
		this.category=ca;
		this.no=no;
	}
	public void addResource(){
	  	db.insert("informational-resource",this.name,this.no,
    			this.createDate,this.format,this.subcategory,this.category,this.type.toString());	
	}
}

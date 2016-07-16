package ResourceManagment;

public class PhysicalResource extends Resource{
	private int No;
	private String type;
	private String modelName;
	public PhysicalResource(int n,String t,String m){
		super(ResourceType.PHYSICAL);
		this.No=n;
		this.modelName=m;
		this.type=t;
		
	}
	
	public void addResource(){
	  	db.insert("physical-resource",this.No,this.type,this.modelName);	
	}
	
}

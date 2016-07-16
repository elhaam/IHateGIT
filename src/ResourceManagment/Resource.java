package ResourceManagment;

import DB.DataSource;
import DB.Driver;

public class Resource {
	

	ResourceType type;
	public static Driver db=new Driver();

	public Resource(ResourceType type) {
		// TODO Auto-generated constructor stub
		this.type=type;
		//db=new Driver();
	}
	public void addResource(){
		
	}
}

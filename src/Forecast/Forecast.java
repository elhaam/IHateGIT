package Forecast;

import java.util.ArrayList;

import DB.Driver;
import ResourceManagment.Resource;

public class Forecast {

	int humanCount;
	int moduleCount;
	ArrayList<Resource> guestResources;
	ArrayList<String> technology;
	private Driver db=new Driver();
	
	ArrayList<Resource> neededResource;
	ArrayList<Resource> essentialResources;
	ArrayList<Resource> nonessentialResources;
	
	public Forecast(int hum,int mod,ArrayList<String> tech){
		this.humanCount=hum;
		this.moduleCount=mod;
		this.technology=tech;
		
	}
	
	public Forecast(ArrayList<Resource> neededResource){
		this.neededResource=neededResource;
	}

	public void estimate() {
		// TODO Auto-generated method stub
		db.estimate(humanCount,moduleCount,technology);
		
	}
	
	
	
}

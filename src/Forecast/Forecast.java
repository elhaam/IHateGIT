package Forecast;

import java.util.ArrayList;

import ResourceManagment.Resource;

public class Forecast {

	int size;
	ArrayList<Resource> guestResources;
	ArrayList<String> technology;
	
	ArrayList<Resource> neededResource;
	ArrayList<Resource> essentialResources;
	ArrayList<Resource> nonessentialResources;
	
	public Forecast(int size,ArrayList<String> tech){
		this.size=size;
		this.technology=tech;
	}
	
	public Forecast(ArrayList<Resource> neededResource){
		this.neededResource=neededResource;
	}
	
	
	
}

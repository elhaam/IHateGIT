package DB;

import java.text.SimpleDateFormat;

import ResourceManagment.HumanResource;


public class DataSource {
	private static DataSource instance;
	private static final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	private Driver db;

	public DataSource() {
		db = Driver.getInstance();
	}

	public static DataSource getInstance() {
		if (instance == null)
			instance = new DataSource();
		return instance;
	}

	public void addHumanResource(HumanResource hr) {
		// TODO Auto-generated method stub
		System.out.println("datasource");
		//db.insertHumanResource(hr);
		System.out.println("datasource finished");
			

		
		
		
	}

	
}

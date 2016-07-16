package Report;

import java.util.ArrayList;

import DB.DataSource;
import DB.Driver;

public class CyclicReport {
	private static CyclicReport self = null;
	private Driver db;
	
	public static CyclicReport getInstance() {
		if (self == null) {
			return new CyclicReport();
		}
		
		return self;
	}
	
	private CyclicReport() {
		db = Driver.getInstance();
	}
	
	
	public ArrayList<String[]> generateReport() {
		ArrayList<String[]> result = new ArrayList<>();
		// TODO 	
	return result;	
	}
	
}

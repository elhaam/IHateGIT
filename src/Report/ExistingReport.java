package Report;

import java.util.ArrayList;

import DB.DataSource;
import DB.Driver;

public class ExistingReport {
	private static ExistingReport self = null;
	private Driver db;
	
	public static ExistingReport getInstance() {
		if (self == null) {
			return new ExistingReport();
		}
		return self;
	}
	
	private ExistingReport() {
		db = Driver.getInstance();
	}
	
	public ArrayList<String[]> generateReport() {
		ArrayList<String[]> result = new ArrayList<>();
		// TODO 	
	return result;	
	}

}

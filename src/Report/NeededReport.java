package Report;

import java.util.ArrayList;

import DB.DataSource;
import DB.Driver;

public class NeededReport {
	private static NeededReport self = null;
	private Driver db;
	
	public static NeededReport getInstance() {
		if (self == null) {
			return new NeededReport();
		}
		return self;
	}
	
	private NeededReport() {
		db = Driver.getInstance();
	}

	public ArrayList<String[]> generateReport() {
		ArrayList<String[]> result = new ArrayList<>();
		// TODO 	
	return result;	
	}
}

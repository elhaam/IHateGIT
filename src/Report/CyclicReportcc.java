package Report;

import java.util.ArrayList;

import DB.DataSource;
import DB.Driver;

public class CyclicReportcc {
	private static CyclicReportcc self = null;
	private Driver db;
	
	public static CyclicReportcc getInstance() {
		if (self == null) {
			return new CyclicReportcc();
		}
		
		return self;
	}
	
	private CyclicReportcc() {
		db = Driver.getInstance();
	}
	
	
	public ArrayList<String[]> generateReport() {
		ArrayList<String[]> result = new ArrayList<>();
		// TODO 	
	return result;	
	}
	
}

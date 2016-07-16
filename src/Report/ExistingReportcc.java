package Report;

import java.util.ArrayList;

import DB.DataSource;
import DB.Driver;

public class ExistingReportcc {
	private static ExistingReportcc self = null;
	private Driver db;
	
	public static ExistingReportcc getInstance() {
		if (self == null) {
			return new ExistingReportcc();
		}
		return self;
	}
	
	private ExistingReportcc() {
		db = Driver.getInstance();
	}
	
	public ArrayList<String[]> generateReport() {
		ArrayList<String[]> result = new ArrayList<>();
		// TODO 	
	return result;	
	}

}

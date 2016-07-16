package Report;

import java.util.ArrayList;

import DB.DataSource;
import DB.Driver;

public class NeededReportcc {
	private static NeededReportcc self = null;
	private Driver db;
	
	public static NeededReportcc getInstance() {
		if (self == null) {
			return new NeededReportcc();
		}
		return self;
	}
	
	private NeededReportcc() {
		db = Driver.getInstance();
	}

	public ArrayList<String[]> generateReport() {
		ArrayList<String[]> result = new ArrayList<>();
		// TODO 	
	return result;	
	}
	
	
}

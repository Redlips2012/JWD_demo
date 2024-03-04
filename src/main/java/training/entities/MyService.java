package training.entities;

public class MyService {
	private DataService dataService;

	// Setter method for injecting DataService dependency
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

	public DataService getDataService() {
		return this.dataService;
	}

	// Other methods using dataService
}
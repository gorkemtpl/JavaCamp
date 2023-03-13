package abstractDemo;

public class CustomerManager {
	
	BaseDataManager databaseManager;
	
	public void getCustomer() {
		databaseManager.getData();
	}
}

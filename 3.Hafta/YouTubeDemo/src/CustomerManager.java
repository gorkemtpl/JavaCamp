
public class CustomerManager {// m��teri y�neticisi.
	
	private Customer customer;
	private ICreditManager iCreditManager;
	
	
	// Di�er metotlardan ula�abilmemiz i�in.
	public CustomerManager(Customer customer, ICreditManager iCreditManager) {

		this.customer = customer;
		this.iCreditManager = iCreditManager;
	}
	
	
	public void Save () {
	
		System.out.println("M��teri Kaydedildi.");
	}
	
	public void Delete () {
		
		System.out.println("M��teri Silindi.");
	}
	
	public void GiveCredit () {
		iCreditManager.Calculate();
		System.out.println("Kredi Verildi.");
	}
	
	
}


public class CustomerManager {// müþteri yöneticisi.
	
	private Customer customer;
	private ICreditManager iCreditManager;
	
	
	// Diðer metotlardan ulaþabilmemiz için.
	public CustomerManager(Customer customer, ICreditManager iCreditManager) {

		this.customer = customer;
		this.iCreditManager = iCreditManager;
	}
	
	
	public void Save () {
	
		System.out.println("Müþteri Kaydedildi.");
	}
	
	public void Delete () {
		
		System.out.println("Müþteri Silindi.");
	}
	
	public void GiveCredit () {
		iCreditManager.Calculate();
		System.out.println("Kredi Verildi.");
	}
	
	
}

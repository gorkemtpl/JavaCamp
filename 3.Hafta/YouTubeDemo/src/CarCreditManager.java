
public class CarCreditManager extends BaseCreditManager implements ICreditManager{// araba kredi y�neticisi

	
	
	@Override
	public void Calculate() {
		
		System.out.println("Araba Kredisi Hesapland�.");
		
	}

	@Override
	public void Save() {
		
		System.out.println("Kaydedildi.");
	}
	
}

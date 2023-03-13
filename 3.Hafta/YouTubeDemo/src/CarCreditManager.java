
public class CarCreditManager extends BaseCreditManager implements ICreditManager{// araba kredi yöneticisi

	
	
	@Override
	public void Calculate() {
		
		System.out.println("Araba Kredisi Hesaplandý.");
		
	}

	@Override
	public void Save() {
		
		System.out.println("Kaydedildi.");
	}
	
}

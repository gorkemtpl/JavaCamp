
public abstract class BaseCreditManager implements ICreditManager{ // ana kredi yöneticisi.

	@Override
	public abstract void Calculate();// ortak deðildir her sýnýf kendine ait tanýmlar.
	
	
	
	@Override
	public void Save() { // ortaktýr.
		
		System.out.println("Kaydedildi.");
	}
	
	
}

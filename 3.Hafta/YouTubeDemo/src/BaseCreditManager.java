
public abstract class BaseCreditManager implements ICreditManager{ // ana kredi y�neticisi.

	@Override
	public abstract void Calculate();// ortak de�ildir her s�n�f kendine ait tan�mlar.
	
	
	
	@Override
	public void Save() { // ortakt�r.
		
		System.out.println("Kaydedildi.");
	}
	
	
}

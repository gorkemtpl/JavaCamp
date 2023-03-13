package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	public double hesapla(double tutuar) { // burada Base 'in hesapla operasyonunu Ogrenci için ezmiş olduk.
		return tutuar * 1.10; 					// Overriding = ezme;
	}
}

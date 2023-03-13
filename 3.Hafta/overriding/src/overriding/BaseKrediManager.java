package overriding;

public class BaseKrediManager {
	
	// Overridable : Üzerine yazýlabilir.
	
	public double hesapla(double tutuar) {
		return tutuar * 1.18; // public void olarak tanýmlarsak return iþlemini yapamayýz.
	}
	
	/*
	 *   final : Bir operasyonu final anahtar kelimesi ile tanýmlarsak,
	 *   burada BaseKrediManager sýnýfýný extends eden alt sýnýflar
	 *   bu operasyonu ezemez.
	 *   operasyonu olduðu gibi kullanýrlar.
	 */
	
}

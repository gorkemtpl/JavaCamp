package overriding;

public class BaseKrediManager {
	
	// Overridable : �zerine yaz�labilir.
	
	public double hesapla(double tutuar) {
		return tutuar * 1.18; // public void olarak tan�mlarsak return i�lemini yapamay�z.
	}
	
	/*
	 *   final : Bir operasyonu final anahtar kelimesi ile tan�mlarsak,
	 *   burada BaseKrediManager s�n�f�n� extends eden alt s�n�flar
	 *   bu operasyonu ezemez.
	 *   operasyonu oldu�u gibi kullan�rlar.
	 */
	
}

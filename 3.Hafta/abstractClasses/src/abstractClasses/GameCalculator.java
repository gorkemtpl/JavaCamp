package abstractClasses;
/*
 *   Abstract : (Soyutlama): abstract bir s�n�f�n abstract olabilmesi i�in 
 *                           abstract anahtar kelimesi ile beslenmesi gerekiyor.
 *   Operasyonun abstract olabilmesi i�in yine operasyonun da bu anahtar kelime ile beslenmesi gerekiyor.
 *   
 *   abstract bir s�n�fta operasyonlar abstract olamayabilir.
 *   Ancak abstract bir operasyonun bulundu�u bir s�n�f abstract olmak zorundad�r...
 *	 
 *   	
 *   		!!! : Abstract s�n�flar asla new'lenemez.
 *	 
 */


public abstract class GameCalculator {
	public abstract void hesapla();// bu operasyonu zorunlu k�ld�k. Ancak bunu kullan�c� t�r�ne g�re herkez override edecek
	
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
}

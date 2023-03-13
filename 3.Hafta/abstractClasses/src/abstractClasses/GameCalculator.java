package abstractClasses;
/*
 *   Abstract : (Soyutlama): abstract bir sýnýfýn abstract olabilmesi için 
 *                           abstract anahtar kelimesi ile beslenmesi gerekiyor.
 *   Operasyonun abstract olabilmesi için yine operasyonun da bu anahtar kelime ile beslenmesi gerekiyor.
 *   
 *   abstract bir sýnýfta operasyonlar abstract olamayabilir.
 *   Ancak abstract bir operasyonun bulunduðu bir sýnýf abstract olmak zorundadýr...
 *	 
 *   	
 *   		!!! : Abstract sýnýflar asla new'lenemez.
 *	 
 */


public abstract class GameCalculator {
	public abstract void hesapla();// bu operasyonu zorunlu kýldýk. Ancak bunu kullanýcý türüne göre herkez override edecek
	
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
}

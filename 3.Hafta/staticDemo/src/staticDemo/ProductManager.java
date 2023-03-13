package staticDemo;

// �r�n� veritaban�na ekleyen k�s�m.

public class ProductManager {
	public void add(Product product) {
		
		//ProductValidator validator = new ProductValidator(); // Bunu yazmamak i�in isValid operasyonunu static yapmam�� gerekiyor.
		/*
		if (validator.isValid(product)) {
			
			System.out.println("Eklendi.");
		}
		else {
			System.out.println("�r�n  bilgileri ge�ersizdir.");
		}*/
		
		
		if (ProductValidator.isValid(product)) { // static ekledi�imiz i�in bu �ekilde kullanabildik.(static boolean isValid)
			System.out.println("Eklendi.");
		}
		else {
			System.out.println("�r�n bilgileri ge�ersizdir.");
		}
		
	}
}

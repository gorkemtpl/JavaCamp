package staticDemo;

// isEmpty = de�er girilmedi anlam�ndad�r.

public class ProductValidator { // bir �r�n� kaydederken, g�ncellerken �r�n�n kurallara uygun olup olamad���n� bulmak i�in kullan�r�z.
	
	static {
		System.out.println("static yap�c� blok �al��t�.");
	}
	
	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�.");
	}
	
	public static boolean isValid(Product product) { // static ekliyoruz ki ProductManager da new'leme yapmayal�m.
		
		if (product.price > 0 && !product.name.isEmpty()) { // isEmpty De�ilse.
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	public static class BaskaBirClass {
		public static void sil() {
			
		}
	}
}

package staticDemo;

// isEmpty = deðer girilmedi anlamýndadýr.

public class ProductValidator { // bir ürünü kaydederken, güncellerken ürünün kurallara uygun olup olamadýðýný bulmak için kullanýrýz.
	
	static {
		System.out.println("static yapýcý blok çalýþtý.");
	}
	
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý.");
	}
	
	public static boolean isValid(Product product) { // static ekliyoruz ki ProductManager da new'leme yapmayalým.
		
		if (product.price > 0 && !product.name.isEmpty()) { // isEmpty Deðilse.
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

package staticDemo;

// ürünü veritabanýna ekleyen kýsým.

public class ProductManager {
	public void add(Product product) {
		
		//ProductValidator validator = new ProductValidator(); // Bunu yazmamak için isValid operasyonunu static yapmamýþ gerekiyor.
		/*
		if (validator.isValid(product)) {
			
			System.out.println("Eklendi.");
		}
		else {
			System.out.println("Ürün  bilgileri geçersizdir.");
		}*/
		
		
		if (ProductValidator.isValid(product)) { // static eklediðimiz için bu þekilde kullanabildik.(static boolean isValid)
			System.out.println("Eklendi.");
		}
		else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
		
	}
}

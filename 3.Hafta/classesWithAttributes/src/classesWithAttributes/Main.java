package classesWithAttributes;

public class Main {
	
	public static void main(String[] args) {
		// Encapsulation tam olarak budur.
		
		
		Product product = new Product(1, "Laptop", "ASUS Laptop", 3000, 2, "siyah", "123");
		
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
		
		
		
	}

}

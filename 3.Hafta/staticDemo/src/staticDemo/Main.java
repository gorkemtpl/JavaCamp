package staticDemo;

public class Main {

	public static void main(String[] args) {
		
		//Not : Bir metodu static yaptýðýmýzda class ismiyle çaðýrabiliriz.

		
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name = "Mause ";
		manager.add(product);
		
		
		
		DatabaseHelper.Crud.Delete();
	}
		

}

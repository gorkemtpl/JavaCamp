package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;
		/*
		 *    Interface (Arayüz) : Arayüz, bir sýnýfta olmasý gereken
		 *  metotlarýn tanýmlandýðý yapýdýr. Fakat kesinlikle bir sýnýf
		 *  deðildir. Arayüzlerin amacý daha çok herhangi bir iþlemin 
		 *  gerçekleþmesi için hangi metotlarýn var olmasý gerektiðini
		 *  belirlemektir. Bu metotlarýn içerikleri ise arayüzleri 
		 *  uygulayan sýnýflar tarafýndan oluþturulur. Arayüzler, java
		 *  programlama dilinde interface anahtar kelimesi ile tanýmlanýrlar.
		 *  
		 *  Interface' ler sadece metot imzasýný barýndýrabilir.
		 */
public interface ProductDao {
	void add(Product product);
	
}

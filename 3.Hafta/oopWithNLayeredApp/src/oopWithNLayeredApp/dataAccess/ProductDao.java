package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;
		/*
		 *    Interface (Aray�z) : Aray�z, bir s�n�fta olmas� gereken
		 *  metotlar�n tan�mland��� yap�d�r. Fakat kesinlikle bir s�n�f
		 *  de�ildir. Aray�zlerin amac� daha �ok herhangi bir i�lemin 
		 *  ger�ekle�mesi i�in hangi metotlar�n var olmas� gerekti�ini
		 *  belirlemektir. Bu metotlar�n i�erikleri ise aray�zleri 
		 *  uygulayan s�n�flar taraf�ndan olu�turulur. Aray�zler, java
		 *  programlama dilinde interface anahtar kelimesi ile tan�mlan�rlar.
		 *  
		 *  Interface' ler sadece metot imzas�n� bar�nd�rabilir.
		 */
public interface ProductDao {
	void add(Product product);
	
}

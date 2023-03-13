package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLoger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
	/*
	 *    Polymorphism (Çok Biçimlilik) Nedir :
	 *  Nesnelerin içeride farklý çalýþmalarýna raðmen,
	 *  dýþarýda ayný biçimde görünmelerini ifade etmektedir.
	 *  
	 *  -- Bir nesnenin bir iþlemi farklý þekillerde 
	 *  yapabileceðini göstermektedir. Birbirine benzeyen 
	 *  nesneleri ortak özellikleriyle ele alarak ya da 
	 *  nesnelerin ayný iþi farklý þekillerde 
	 *  yapabilmesini saðlamaktadýr.
	 *  -- ÖRN : Genel anlamda asker olarak anýlan kiþilerin bir Er, bir Çavuþ,
	 *   bir Astsubay veya bir Subay olabilmesi gibi.  
	 */
	
	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhone Xr", 11);
		
		Logger[] loggers = {new DatabaseLoger(), new FileLogger(), new MailLogger() };
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
	}

}

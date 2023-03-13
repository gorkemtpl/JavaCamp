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
	 *    Polymorphism (�ok Bi�imlilik) Nedir :
	 *  Nesnelerin i�eride farkl� �al��malar�na ra�men,
	 *  d��ar�da ayn� bi�imde g�r�nmelerini ifade etmektedir.
	 *  
	 *  -- Bir nesnenin bir i�lemi farkl� �ekillerde 
	 *  yapabilece�ini g�stermektedir. Birbirine benzeyen 
	 *  nesneleri ortak �zellikleriyle ele alarak ya da 
	 *  nesnelerin ayn� i�i farkl� �ekillerde 
	 *  yapabilmesini sa�lamaktad�r.
	 *  -- �RN : Genel anlamda asker olarak an�lan ki�ilerin bir Er, bir �avu�,
	 *   bir Astsubay veya bir Subay olabilmesi gibi.  
	 */
	
	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhone Xr", 11);
		
		Logger[] loggers = {new DatabaseLoger(), new FileLogger(), new MailLogger() };
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
	}

}

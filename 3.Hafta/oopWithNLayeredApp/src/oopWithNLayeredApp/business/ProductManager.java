package oopWithNLayeredApp.business;


import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {         // Hata fýrlatýlabilir
	
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {    // ProductManager new'lendiðinde bana bir productDao ver.
	this.productDao = productDao;
	this.loggers = loggers;
}


	public void add (Product product) throws Exception {        // response request.
		
		// Ýþ kurallarý.

		/* throw Exception : Hatalarýn kodumuza göre 
		*  özelleþtirilmesini saðlayan bir özelliktir...
	    */
		
		
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün diyatý 10 dan küçük olamaz");    // throw : Fýrlat.
			
		
		}
		// Kötü Bir kod.
		// Bir katman baþka bir katmanýn class ýný kullanýyorken sadece ýnterface 'den eriþim kurmalýdýr.
		
		

		
		productDao.add(product); // burada dataAccess e gidiyoruz ve onun add ' ini çaðýrýyoruz.
		
		// polymorphism.
		for (Logger logger : loggers) { // [db,mail]
			logger.log(product.getName());
		}
	}
}

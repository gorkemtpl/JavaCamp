package oopWithNLayeredApp.business;


import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {         // Hata f�rlat�labilir
	
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {    // ProductManager new'lendi�inde bana bir productDao ver.
	this.productDao = productDao;
	this.loggers = loggers;
}


	public void add (Product product) throws Exception {        // response request.
		
		// �� kurallar�.

		/* throw Exception : Hatalar�n kodumuza g�re 
		*  �zelle�tirilmesini sa�layan bir �zelliktir...
	    */
		
		
		if (product.getUnitPrice() < 10) {
			throw new Exception("�r�n diyat� 10 dan k���k olamaz");    // throw : F�rlat.
			
		
		}
		// K�t� Bir kod.
		// Bir katman ba�ka bir katman�n class �n� kullan�yorken sadece �nterface 'den eri�im kurmal�d�r.
		
		

		
		productDao.add(product); // burada dataAccess e gidiyoruz ve onun add ' ini �a��r�yoruz.
		
		// polymorphism.
		for (Logger logger : loggers) { // [db,mail]
			logger.log(product.getName());
		}
	}
}

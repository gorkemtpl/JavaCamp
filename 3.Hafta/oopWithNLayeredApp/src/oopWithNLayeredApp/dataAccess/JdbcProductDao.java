package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product; 

public class JdbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		// sadece ve sadece db eri�im kodlar� buraya yaz�l�r...SQL
		System.out.println("JDBC ile veritaban�na eklendi.");
		
	} // Dao : Data Access Object
	

	
}

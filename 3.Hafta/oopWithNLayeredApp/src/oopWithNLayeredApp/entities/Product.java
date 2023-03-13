package oopWithNLayeredApp.entities;

public class Product { // buras� bizim veritaban� nesnemiz
	private int id;
	private String name;
	private double unitPrice;
	
	
	
	// Constructor m�z�n 3 alan�n� eklemeden olu�t�urduk.
	public Product() { 
		super();
		// Burada super anahtar kelimesini kald�rd���m�zda herhangi bir sorun olmaz.
		
		/*    super anahtar s�zc��� this anahtar 
		 *  s�zc��� ile ayn� mant�kta �al���r 
		 *  fakat �st s�n�f �yerine eri�im i�in 
		 *  kullan�l�r.
		 * 
		 */
	}


	
	// burada da Constructor m�z� lanlar� ekleyerek olu�turduk.
	public Product(int id, String name, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}


	
	// Get ve Set
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getUnitPrice() {
		return unitPrice;
	}



	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	
}

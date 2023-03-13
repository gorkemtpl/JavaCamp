package oopWithNLayeredApp.entities;

public class Product { // burasý bizim veritabaný nesnemiz
	private int id;
	private String name;
	private double unitPrice;
	
	
	
	// Constructor mýzýn 3 alanýný eklemeden oluþtýurduk.
	public Product() { 
		super();
		// Burada super anahtar kelimesini kaldýrdýðýmýzda herhangi bir sorun olmaz.
		
		/*    super anahtar sözcüðü this anahtar 
		 *  sözcüðü ile ayný mantýkta çalýþýr 
		 *  fakat üst sýnýf üyerine eriþim için 
		 *  kullanýlýr.
		 * 
		 */
	}


	
	// burada da Constructor mýzý lanlarý ekleyerek oluþturduk.
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

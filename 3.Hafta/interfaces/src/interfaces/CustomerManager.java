package interfaces;

public class CustomerManager { // iþ katmaný.
	
	private ICustomerDal customerDal;// buradeki deðiþkeniiçeride kullanmak için public'den private' a çevirdik.
	
	public CustomerManager (ICustomerDal customerDal) { // burada bir nevi constructor getrimiþ olduk.
		
		this.customerDal = customerDal;
	}
	
	public void add() {
		// iþ kodlarý yazýlacak.
		//OracleCustomerDal oracleCustomerDal = new OracleCustomerDal(); sistem sadece oracle da çalýþýr ve baðlý oluruz.
		
		customerDal.add();
	}

}

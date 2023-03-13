package interfaces;

public class CustomerManager { // i� katman�.
	
	private ICustomerDal customerDal;// buradeki de�i�kenii�eride kullanmak i�in public'den private' a �evirdik.
	
	public CustomerManager (ICustomerDal customerDal) { // burada bir nevi constructor getrimi� olduk.
		
		this.customerDal = customerDal;
	}
	
	public void add() {
		// i� kodlar� yaz�lacak.
		//OracleCustomerDal oracleCustomerDal = new OracleCustomerDal(); sistem sadece oracle da �al���r ve ba�l� oluruz.
		
		customerDal.add();
	}

}

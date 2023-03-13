package interfaces;

public class Main {

	public static void main(String[] args) {                    // parametremiz.
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		
		//customerManager.customerDal = new OracleCustomerDal(); CustomerManager'da : private ICustomerDal customerDal bu kýsmý
		                                                      // private olarak deðiþtirdiðimiz için bu satýra gerek yok ancak 
		customerManager.add();                                // new Customermanager içerisine parametre vermeliyiz.   
															   	
		

		
		
		/*
		 * ICustomerDal customerDal = new OracleCustomerDal();// interface'ler referans
		 * tutucudur. customerDal.add();
		 */

		/*
		 * ICustomerDal customerDal = new ICustomerDal() {
		 * 
		 * @Override public void add() { // TODO Auto-generated method stub
		 * 
		 * } }; NOT : Interface' ler de abstract' lar gibi new'lenemezler. Ýmza
		 * taþýrlar.
		 */

	}

}

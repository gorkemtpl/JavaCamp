
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();
		
		
	
		
		/*
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer = new Customer(); // instance oluşturmak, instance creation.
		
		customer.Id = 1;
		customer.City = "Ankara";
		
		
		CustomerManager customerManager = new CustomerManager(customer);
		
		customerManager.Save();
		customerManager.Delete();
		
		Company company = new Company();
		company.taxNumber = "200000";
		company.companyName = "Arçelik";
		company.Id = 100;
		
		 													// Burada istediğimizi verebiliriz.
		CustomerManager customerManager2 = new CustomerManager(new Person());
		
		
		
		Person person = new Person();
		person.firstName = 
		person.NationalIdentity = "";
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company(); */
	}

}

package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	
	
	public CustomerManager(BaseLogger logger) {
		super();
		this.logger = logger;
	}



	public void add() { 									// new'lemek baðýmlý olmaktýr.
		System.out.println("Müþteri eklendi.");				
		this.logger.log("log mesajý");
	}
}

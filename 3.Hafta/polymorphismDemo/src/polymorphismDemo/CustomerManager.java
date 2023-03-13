package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	
	
	public CustomerManager(BaseLogger logger) {
		super();
		this.logger = logger;
	}



	public void add() { 									// new'lemek ba��ml� olmakt�r.
		System.out.println("M��teri eklendi.");				
		this.logger.log("log mesaj�");
	}
}

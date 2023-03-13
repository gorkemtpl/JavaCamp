package polymorphismDemo;

public class Main {            // Loglama uygulamas�.
                              
	public static void main(String[] args) {
		/*
		EmailLogger logger = new EmailLogger();
		logger.log("Log mesaj�"); */
		
		 /*                                    // bu sistemde istedi�imiz logger� ekler ve ��kartabiliriz.(polymorphism);
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
		for (BaseLogger logger:loggers) {
			logger.log("Log mesaj�");
		} */
		
		
		CustomerManager customerManager = new CustomerManager(new BaseLogger());
		customerManager.add();
	}

}

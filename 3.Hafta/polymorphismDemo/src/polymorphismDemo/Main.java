package polymorphismDemo;

public class Main {            // Loglama uygulamasý.
                              
	public static void main(String[] args) {
		/*
		EmailLogger logger = new EmailLogger();
		logger.log("Log mesajý"); */
		
		 /*                                    // bu sistemde istediðimiz loggerý ekler ve çýkartabiliriz.(polymorphism);
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
		for (BaseLogger logger:loggers) {
			logger.log("Log mesajý");
		} */
		
		
		CustomerManager customerManager = new CustomerManager(new BaseLogger());
		customerManager.add();
	}

}

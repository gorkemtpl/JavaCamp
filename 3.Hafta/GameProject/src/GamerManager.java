
public class GamerManager implements IGamer{
	
	/*
	 *   NOT : Bir manager sýnýfýn içerisinde baþka bir manager sýnýfý 
	 *   kullanacaksan onu asla ama asla new'leme.
	 *    
	 */
	
	IUserValidationService userValidationService; // Burasý bir Constructor dýr.
	// AMACI : GamerManager'ýn bir baðlýlýðý var ve bu GamerManager'ýn içerisinde ben bir doðrulama servisini kullanacaðým demek bu.
	// Satýr : 10 ve 17 yukarýdaki açýklamaya dahildir.
	
	public GamerManager(IUserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}

	
	
	
	@Override
	public void add(Gamer gamer) {
		if (userValidationService.validate(gamer) == true) {
			
			System.out.println(gamer.getFirstName() + " adlý oyuncu kaydedildi.");
		}
		else {
			System.out.println("Doðrulama Baþarýsýz. Kayýt Baþarýsýz.");
		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý oyuncu güncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý oyuncu silindi.");
		
	}
	
	
}


public class GamerManager implements IGamer{
	
	/*
	 *   NOT : Bir manager s�n�f�n i�erisinde ba�ka bir manager s�n�f� 
	 *   kullanacaksan onu asla ama asla new'leme.
	 *    
	 */
	
	IUserValidationService userValidationService; // Buras� bir Constructor d�r.
	// AMACI : GamerManager'�n bir ba�l�l��� var ve bu GamerManager'�n i�erisinde ben bir do�rulama servisini kullanaca��m demek bu.
	// Sat�r : 10 ve 17 yukar�daki a��klamaya dahildir.
	
	public GamerManager(IUserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}

	
	
	
	@Override
	public void add(Gamer gamer) {
		if (userValidationService.validate(gamer) == true) {
			
			System.out.println(gamer.getFirstName() + " adl� oyuncu kaydedildi.");
		}
		else {
			System.out.println("Do�rulama Ba�ar�s�z. Kay�t Ba�ar�s�z.");
		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adl� oyuncu g�ncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adl� oyuncu silindi.");
		
	}
	
	
}

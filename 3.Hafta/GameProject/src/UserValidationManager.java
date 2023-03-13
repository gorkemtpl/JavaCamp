
public class UserValidationManager implements IUserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		
		if (gamer.getBirthYear() == 1985 && gamer.getFirstName() == "Engin" && gamer.getLastName() == "Demiroð" 
				&& gamer.getIdentitiyNumber() == 12345) {
			
			return true;
		}
		else {
			return false;
			
		}
		
	}
	
}

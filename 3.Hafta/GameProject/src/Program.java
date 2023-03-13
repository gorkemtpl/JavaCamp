
public class Program {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new NewEStateUserValidationManager());
		gamerManager.add(new Gamer(1, "Engin", "Demiroð", 1985, 12345));
									// Deðerleri yanlýþ da girsek sistem artýk kabul edecek ve oyuncu kaydedilecek.

	}

}

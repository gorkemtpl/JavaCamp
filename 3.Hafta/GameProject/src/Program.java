
public class Program {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new NewEStateUserValidationManager());
		gamerManager.add(new Gamer(1, "Engin", "Demiro�", 1985, 12345));
									// De�erleri yanl�� da girsek sistem art�k kabul edecek ve oyuncu kaydedilecek.

	}

}

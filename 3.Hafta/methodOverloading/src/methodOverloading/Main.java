package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		System.out.println("2 say�n�n toplam� : " + dortIslem.topla(2, 2));
		System.out.println("3 say�n�n toplam� : " + dortIslem.topla(2, 2, 2));
		System.out.println("4 say�n�n toplam� : " + dortIslem.topla(2, 2, 2, 2));
		System.out.println("5 say�n�n toplam� : " + dortIslem.topla(2, 2, 2, 2, 2));

	}

}

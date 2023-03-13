package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		System.out.println("2 sayýnýn toplamý : " + dortIslem.topla(2, 2));
		System.out.println("3 sayýnýn toplamý : " + dortIslem.topla(2, 2, 2));
		System.out.println("4 sayýnýn toplamý : " + dortIslem.topla(2, 2, 2, 2));
		System.out.println("5 sayýnýn toplamý : " + dortIslem.topla(2, 2, 2, 2, 2));

	}

}

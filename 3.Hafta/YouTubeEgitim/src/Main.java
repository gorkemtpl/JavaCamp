
public class Main {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		
		
		System.out.println("Say�1 De�erimiz : " + sayi1);
		System.out.println("Say�2 De�erimiz : " + sayi2);
		
		System.out.println("*****************************");
		
		int[] sayilar1 = new int[] {1, 2, 3};
		int[] sayilar2 = new int[] {10, 20, 30};
		
		sayilar1 = sayilar2;
		sayilar1[0] = 1000;
		
		System.out.println("Say�lar1 dizimizin 0. eleman� : " + sayilar1[0]);
		System.out.println("Say�lar2 dizimizin 0. eleman� : " + sayilar2[0]);
		
		
	}

}

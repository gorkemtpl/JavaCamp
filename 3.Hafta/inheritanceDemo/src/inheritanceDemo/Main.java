package inheritanceDemo;

public class Main {                      // Bir kredi hesaplama program�.
										 // Bir class sadece bir tane class� inheritance(extends) edebilir.
	public static void main(String[] args) {
		
		/*
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla(); */
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new TarimKrediManager());
		
		
		// Bu proje bir polymorphism �rne�idir.
	}

}

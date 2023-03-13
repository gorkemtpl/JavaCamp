package inheritanceDemo;

public class Main {                      // Bir kredi hesaplama programý.
										 // Bir class sadece bir tane classý inheritance(extends) edebilir.
	public static void main(String[] args) {
		
		/*
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla(); */
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new TarimKrediManager());
		
		
		// Bu proje bir polymorphism örneðidir.
	}

}

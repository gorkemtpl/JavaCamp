
public class NewEStateUserValidationManager implements IUserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		
		return true;
		
		/*
		 *    Buradaki olay� ��yle d���nelim ;
		 *    
		 *    bu class'� olu�turmadan �nce kaydedilecek oyuncunun herhangi bir bilgisi yanl�� girildi�inde 
		 *    sistem false d�nderiyordu ve oyuncu kaydedilmedi yaz�yordu ekranda.
		 *    
		 *    Ancak bu class ile biz �unu yapt�k. Bu class' �  IUserValidationService interface ile implements ediyoruz.
		 *    ve IUserValidationService i�erisinde ki boolean olarak tan�mlanm�� operasyonu biz burada @Override ediyoruz ve
		 *    bu operasyonu burada true d�nd�r�yoruz.
		 *    
		 *    Bunun sebebi y�netimin karar de�i�tirmesidir.Yani d�n yanl�� girilen oyuncu bilgisi kabul edilmezken bug�n kabul ediliyor.
		 *    
		 */
	}
	
}

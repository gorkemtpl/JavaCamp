
public class NewEStateUserValidationManager implements IUserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		
		return true;
		
		/*
		 *    Buradaki olayý þöyle düþünelim ;
		 *    
		 *    bu class'ý oluþturmadan önce kaydedilecek oyuncunun herhangi bir bilgisi yanlýþ girildiðinde 
		 *    sistem false dönderiyordu ve oyuncu kaydedilmedi yazýyordu ekranda.
		 *    
		 *    Ancak bu class ile biz þunu yaptýk. Bu class' ý  IUserValidationService interface ile implements ediyoruz.
		 *    ve IUserValidationService içerisinde ki boolean olarak tanýmlanmýþ operasyonu biz burada @Override ediyoruz ve
		 *    bu operasyonu burada true döndürüyoruz.
		 *    
		 *    Bunun sebebi yönetimin karar deðiþtirmesidir.Yani dün yanlýþ girilen oyuncu bilgisi kabul edilmezken bugün kabul ediliyor.
		 *    
		 */
	}
	
}

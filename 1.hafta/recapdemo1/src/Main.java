public class Main {
    public static void main(String[] args) {
        //En Büyük Sayıyı Bulmak.
        
        int sayi1 = 15;//En Büyük Sayımız a.
        int sayi2 = 10;
        int sayi3 = 9;
        
        int enBuyuk = sayi1; // Burada en büyük sayımızı (enbuyuk) değişkenine atadık.
        
        if (enBuyuk < sayi2) {//Eğer enBuyuk sayımız b'den küçükse bu kod bloğunu çalıştır.
            
            enBuyuk = sayi2; 
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        
        System.out.println("En Büyük : " + enBuyuk);
               
}       
}

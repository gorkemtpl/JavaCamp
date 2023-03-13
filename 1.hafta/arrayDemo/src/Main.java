public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Görkem";
        String ogrenci2 = "Esma";
        String ogrenci3 = "Ahmet";
        String ogrenci4 = "Derin";
        
        System.out.println("*************************************************");
        
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
        //böyle uzun uzun yazmak yerine :
        
        System.out.println("*************************************************");
        String [] ogrenciler = new String[4];
        ogrenciler[0] = "Görkem";
        ogrenciler[1] = "Ahmet";
        ogrenciler[2] = "Derin";
        ogrenciler[3] = "Esma";
        
        for (int i = 0; i < ogrenciler.length; i++) {
            
            System.out.println(ogrenciler[i]);
        }
        
        
        // Daha kullanışlı olan kullanım.
        System.out.println("*************************************************");
        for (String ogrenci:ogrenciler) {//Ögrenciler Dizisindeki her bir elemanı gez demektir.
            
            System.out.println(ogrenci);
            
        }
        
        
}
}

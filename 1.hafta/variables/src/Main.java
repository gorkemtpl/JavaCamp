public class Main {
    public static void main(String[] args) {
        
        System.out.println("Öğrenci Sayısı : 10");
        System.out.println("Öğrenci Sayısı : 10");
        System.out.println("Öğrenci Sayısı : 10");
        System.out.println("Öğrenci Sayısı : 10");
        System.out.println("Öğrenci Sayısı : 10");
        
        //Bunun yerine :
        //reusability : Bir kere yaz ve onu tekrar tekrar kullan...
        
        /*
        int ogrncisayisi = 10;
        System.out.println("Öğrenci Sayısı : " + ogrncisayisi);
        */
        
        int ogrenciSayisi = 10;
        String mesaj = "Öğrenci Sayısı : ";
        System.out.println(mesaj + ogrenciSayisi);
}
}

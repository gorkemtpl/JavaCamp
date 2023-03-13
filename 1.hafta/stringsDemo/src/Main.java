public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel";
        System.out.println(mesaj);
        
        System.out.println("Eleman Sayısı : " + mesaj.length());
        System.out.println("Beşinci Eleman : " + mesaj.charAt(4));
        //charAt() : istenilen yerdeki elemanı bulur.
        System.out.println(mesaj.concat(" yaşasın")); //Çıktı: Bugün Hava Çok Güzel yaşasın
        //concat() : birleştirmek anlamındadır.
        
        System.out.println(mesaj.startsWith("B"));
        //startsWith(): Belirttiğimiz karakter ile başlıyor mu kontrol eder.Başlıyorsa true, başlamıyorsa false.
        
        System.out.println(mesaj.endsWith("."));
        //endsWith(): Belirttiğimiz karakter ile bitiyor mu kontrol eder.Bitiyorsa true, bitmiyorsa false.
        
        char [] karakterler = new char[5];
        mesaj.getChars(0, 5,karakterler, 0);//Buranın anlamı = 0'dan 4'de kadar -> karakterler' e ata ve 
                                            //0. indeksinden itibaren aktar.
        //getChars(): Karakterleri al anlamındadır.
        System.out.println(karakterler);
        
        System.out.println(mesaj.indexOf("av")); //Çıktı : 7
        //indexOf(): Belirttiğimiz karakterin mesaj içerisinde kaçıncı eleman olduğunu anlamaya yarar.
        //Burada a'yı aratıyoruz. Bize ilk bunduğu a'yı gösterir ve sonlanır.
        //indexOf(): Aramaya en soldan başlayan bir komuttu.
        
        System.out.println(mesaj.lastIndexOf("a"));
        //lastIndexOf(): Aramaya en sağdan başlayan bir komuttur.
        
 }
}

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel";
        System.out.println(mesaj);
        
        System.out.println(mesaj.replace(" ", "-"));/* Burada boşlukları çizgi ile değiştirdik.
        replace(oldChar,newChar): Seçtiğimiz metindeki kelimeler arasında boşluk/çizgi (veya başka bir ifade) ile 
        değiştirmemizi sağlar. */
        
        System.out.println("-------------------------------------------------");
        
        //Yukarıdaki uygulamayı başka yerlerde de kullanmak için:
        String yeniMesaj = mesaj.replace(" ", "-");
        System.out.println(yeniMesaj);
        
        
        System.out.println(mesaj.substring(2));//substring(int beginındex)
        //substring(): Belirlediğimiz karakterden itibaren al anlamındadır.
        System.out.println(mesaj.substring(2, 4));//substring(int beginındex, int endIndex)
        // 2'den başla 4'e kadar...
        
        
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
            
            /* split (): Metnimizi bizim belirlediğimiz kritere göre alt alta sıralar.
               boşluğa göre sıralama yapıldı. */
        }
        
        
        System.out.println(mesaj.toLowerCase());
        //toLowerCase(): Metnimiz içerisindeki tüm karakterleri küçük harflare çevirmek için kullanılır.
        
        System.out.println(mesaj.toUpperCase());
        //toUpperCase(): Metnimiz içerisindeki tüm karakterleri büyük harflare çevirmek için kullanılır.
        
        System.out.println(mesaj.trim());
        /* trim(): Metinimiz içindeki başta ve sondaki gereksiz boşlukları atmak için kullanılır.
        String mesaj = "     Bugün Hava Çok Güzel     " */
        
}
}

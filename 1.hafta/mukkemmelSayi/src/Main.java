
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Mükkemmel Sayı : Kendinden başka pozitif tam bölenlerin sayısı kendisine eşit olan sayıya mükkemmel bir sayıdır.
        */
        
        
        int number = 28;
        int total = 0;
        
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
                System.out.println(i);// Girilen Sayı Hangi Sayılara Tam Bölünüyor Ekrana Yazar.
            }
        }
        if (total == number) {
            System.out.println("Mükkemmel Bir Sayıdır...");
        }
        else {
            System.out.println("Mükkemmel Bir Sayı Değildir...");
        }
                
        System.out.println("*************************************************");
        //Kullanıcıdan Alınan Bir Sayının Mükkemmel Bir Sayı Olup Olamadığını Kontrol Edelim.
        
        
        Scanner scanner = new Scanner (System.in);
        
        int totall = 0;
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int sayi = scanner.nextInt();//Kullanıcı bir sayı girer.
        
        for (int i = 1; i<sayi; i++) {
            if (sayi % i == 0){
                totall += i;
                System.out.println(i);// Girilen Sayı Hangi Sayılara Tam Bölünüyor Ekrana Yazar.
            }
        }
        if (totall == sayi) {
            System.out.println("Girilen Sayı Mükkemmel Bir Sayıdır...");
        }
        else {
            System.out.println("Girilen Sayı Mükkkemmel Bir Sayı Değildir...");
        }
        
        
        
        
        
        
        
        
        
        
}
}

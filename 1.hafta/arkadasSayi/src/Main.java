
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Arkadaş Sayılar.
        //220-284.
        
        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;
        
        for (int i = 1; i<sayi1; i++) {
            
            if (sayi1 % i == 0) {
                toplam1 += i;
            }
        }
        for (int i = 1; i<sayi2; i++) {
            
            if (sayi2 % i == 0) {
                toplam2 += i;
            }
        }
        // && :ve anlamındadır. || : veya anlamındadır.
        // = : atama anlamındadır. == : eşittir anlamındadır.
        if (sayi1 == toplam2 && sayi2 == toplam1) {
            
            System.out.println("Bu İki Sayı Arkadaştır...");
        }
        else {
            System.out.println("Bu İki Sayı Arkadaş Değildir...");
        }
        System.out.println("*************************************************");
    
    
        

        //Kullanıcıdan İki Sayı Alarak Yapalım.
        
        Scanner scanner = new Scanner(System.in);
        int total1 = 0;
        int total2 = 0;
        
        System.out.print("Lütfen Birinci Sayıyı Giriniz : ");
        int number1 = scanner.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Giriniz : ");
        int number2 = scanner.nextInt();
        
        for (int a = 1; a<number1; a++) {
            if (number1 % a == 0) {
                total1 += a;
            }
        }
        for (int a = 1; a<number2; a++) {
            if (number2 % a == 0) {
               total2 += a;
            }
        }
        if (number1 == total2 && number2 == total1) {
            System.out.println("Bu İki Sayı Arkadaştır...");
        }
        else {
            System.out.println("Bu İki Sayı Arkadaş Sayı Değildir...");
        }
    }
    
}


    
    


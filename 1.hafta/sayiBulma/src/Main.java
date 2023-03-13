
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int [] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;
        
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }    
            
    }
           
        if (varMi) {
            System.out.println("Sayı Mevcuttur...");
        }
        else {
            System.out.println("Sayı Mevcut Değildir...");
        }
        
        System.out.println("*************************************************");
        
        
        //Kullanıcıdan Bir Sayı Alarak Yapalım.
        
        Scanner scanner = new Scanner (System.in);
        
        int[] numbers = new int[] {1,4,5,9,7,0};
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int a = scanner.nextInt();
        boolean VarMİ = false;
        
        for (int say : numbers) {
            if (say == a){
                VarMİ = true;
                break;
            }
        }
        
        if (VarMİ) {
            System.out.println("Sayı Mevcuttur...");
        }
        else {
            System.out.println("Sayı Mevcut Değildir...");
        }
        
        
        
        
}
    
}

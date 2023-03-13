public class Main {
    public static void main(String[] args) {
        int number = 41;
        int remainder = number % 2;
        
        boolean isPrime = true;
        
        if (number == 1) {
            
            System.out.println("Sayı Asal Değildir.");
            return;
        }
        if (number < 1) {
            System.out.println("Geçersiz Sayı.");
        }
        for (int i=2; i<number; i++) {
            
            if (number % i == 0) {
                
                isPrime = false;   
            }
        }
        if (isPrime) {//true ise.
            
            System.out.println("Sayı Asaldır.");
        }
        else {
            System.out.println("Sayı Asal Değildir.");
        }
        
            
        
}
}

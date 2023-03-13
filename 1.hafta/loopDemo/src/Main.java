public class Main {
    public static void main(String[] args) {
        //for döngüsü kullanımı.
        //for'dan önce bir değişkeni tanımlamazsak for içinde tanımlanması gerekir.
        
        for (int i = 1; i < 10; i += 2){
            //i --> 1'den başlar ve i --> 10 olana kadar döngü durmadan devam eder.
            System.out.println(i);
            
        }
        System.out.println("For Döngüsü Bitti.");
        
        
        //while döngüsü kullanımı.
        
        int i = 1;
        while (i < 10){
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Bitti.");
        
        
        
        //do-while döngüsü kullanımı.
        //while döngüsünden farkı: Şart sağlanmasa bile do-while bir kez çalışır.
        int j = 2;
        do {
           
            System.out.println(j);
            j +=2;
          
        }while (j < 10);
        
        System.out.println("do-while Döngüsü Bitti.");
}
}

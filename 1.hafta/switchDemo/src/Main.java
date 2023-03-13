public class Main {
    public static void main(String[] args) {
        //char değeri tek tırnak içine yazılır.
        
        char grade = 'A';
        
        //case : Durum demektir.Ve sonuna ikinokta konur. (:)
        
        switch (grade) {//Şart
            case 'A':
                System.out.println("Mükkemmel : Geçtiniz.");
                break;
                //break ile sonlandırıyoruz.
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz.");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz.");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz.");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız...");
                break;
                
                //default : Yukarıdaki notların dışında bir not girilirse çalış anlamındadır.
                default: //case gibi (:) ikinokta ile gösterilir.
                    System.out.println("Geçersiz Not Girdiniz...");
        }
}
}

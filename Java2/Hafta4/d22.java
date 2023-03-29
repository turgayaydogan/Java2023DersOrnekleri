import java.util.Scanner;

public class d22 {
    public static void main(String[] args) {
        //HATALI ÇÖZÜM
        
        int sayi=0,bitis,kalan;

        Scanner giris =  new Scanner(System.in);

        System.out.println("Bitiş Degeri Gir:");
        bitis = giris.nextInt();

        do {
            kalan = sayi % 7; //    kalan = 0,1,2,3,4,5,6       kalan=0

            if(kalan==0)// 7 tam bölünebilir 7 nin katı
                System.out.println(kalan);
            
            sayi++;
                
        } while (sayi<bitis);
    }
}

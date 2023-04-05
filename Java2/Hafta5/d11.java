import java.util.Scanner;

public class d11 {
    public static void main(String[] args) {
        // Klavyeden negatif sayı girilinceye kadar 10 dan büyük sayıları toplayan ve bu
        // sayıların âdetini bulan programın kodlarını yazınız.

        // pozitif      ==> 10 ve büyük olanların toplam ve adeti
        // 0
        // negatif

        int sayi,toplam=0,adet=0;
        Scanner giris=new Scanner(System.in);

        do {
            System.out.print("Sayı: ");
            sayi = giris.nextInt();

            if(sayi>=10){
                toplam += sayi;
                adet++;
            }

        } while (sayi>=0);
        System.out.println("Toplam="+toplam);
        System.out.println("Adet="+adet);
    }
}

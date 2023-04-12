import java.util.Scanner;

public class d23 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        double sayi,toplam=0;
        double ortalama;

        for(int i=0; i<5 ;i++){
            System.out.println("Sayı:");
            sayi = giris.nextInt();

            toplam = toplam +sayi;
        }

        ortalama = toplam / 5.0;                 // int/int = int
        System.out.println("Ortalam="+ortalama);
    }
}

import java.util.Scanner;

public class d16 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi, kalan, toplam = 0;

        System.out.println("Sayıyı Gir:");
        sayi = giris.nextInt();

        for (int i = 1; i < sayi; i++) {
            kalan = sayi % i;
            if (kalan == 0)// tam böleni
                toplam = toplam + i;    //tam bölenlerinin toplama işlemi
        }

        if (sayi == toplam) //tam bölenlerin toplamı sayının kendisine eşit ise
            System.out.println("Mükemmel sayıdır");
        else
            System.out.println("Sayı mükemmel DEĞİLDİR");
    }
}

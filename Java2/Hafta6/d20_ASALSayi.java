import java.util.Scanner;

public class d20_ASALSayi {
    public static void main(String[] args) {
        // ASAL SAYI
        // sadece 1 ve kendisine tam bölünebilen sayılara asal sayı denir
        // tam bolen adeti = 2 ise sayı asal sayıdır

        Scanner giris = new Scanner(System.in);

        int sayi, kalan, adet = 0;

        System.out.println("Sayı:");
        sayi = giris.nextInt();

        for (int i = 1; i <= sayi; i++) {
            kalan = sayi % i;
            if (kalan == 0)// tam bölem ise
                adet++;
        }

        if (adet == 2)
            System.out.println("Sayı asal sayıdır");
        else
            System.out.println("Sayı asal DEĞİLDİR");
    }
}

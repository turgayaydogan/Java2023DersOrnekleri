import java.util.Scanner;

public class d19 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi, kalan, toplam = 0;

        System.out.println("Sayı:");
        sayi = giris.nextInt();

        for (int i = 1; i < sayi; i++) {
            kalan = sayi % i;
            if (kalan == 0)// tam böleni ise
                toplam += i;
        }

        if (toplam == sayi)
            System.out.println("sayı mükemmel sayıdır");
        else
            System.out.println("Sayı mükemmel DEĞİLDİR");

    }
}

import java.util.Scanner;

public class d6 {
    public static void main(String[] args) {
        sayilariListele();
    }

    static void sayilariListele() {
        Scanner giris = new Scanner(System.in);

        int sayi1, sayi2;
        int kalan;

        System.out.print("1.Sayı:");
        sayi1 = giris.nextInt();

        System.out.print("2.Sayı:");
        sayi2 = giris.nextInt();

        for (int i = sayi1; i <= sayi2; i++) {// sayi1 den sayi2 e kadar aradaki tüm sayılar
            kalan = i % 5;// sıradaki sayının 5e bölümündne kalanı hesapla
            if (kalan == 0)// 5in katı ise
                System.out.println(i);
        }

    }
}

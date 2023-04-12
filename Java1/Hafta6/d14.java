import java.util.Scanner;

public class d14 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);

        int sayi,kuvvet,sonuc;

        System.out.println("Sayıyı Gir:");
        sayi = giris.nextInt();

        System.out.println("Kuvvetini Gir:");
        kuvvet = giris.nextInt();

        sonuc=1;

        for (int i = 0; i < kuvvet; i++) {
            sonuc *= sayi;
        }

        System.out.println("Sonuc="+sonuc);
    }
}

import java.util.Scanner;

public class d17 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi, kuvvet, sonuc = 1;

        System.out.println("Sayı:");
        sayi = giris.nextInt();

        System.out.println("Kuvvet:");
        kuvvet = giris.nextInt();

        for(int i=0; i<kuvvet;i++)
            sonuc = sonuc * sayi;

        System.out.println(sonuc);

    }
}

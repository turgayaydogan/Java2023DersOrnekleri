import java.util.Scanner;

public class d4 {
    public static void main(String[] args) {

        int satirSayisi, sutunSayisi;
        double satirToplami = 0, ortalama;

        Scanner giris = new Scanner(System.in);

        int[][] sayilar;

        System.out.print("Satır Sayısı Gir:");
        satirSayisi = giris.nextInt();

        System.out.print("Sutun Sayısı Gir:");
        sutunSayisi = giris.nextInt();

        sayilar = new int[satirSayisi][sutunSayisi];

        // rastgele değer atama ve akrana yazdıralım
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                sayilar[i][j] = 50 + (int) (Math.random() * 50);
                System.out.print(sayilar[i][j] + "\t");
            }
            System.out.println();
        }

        // herbir satır toplamını bul ve ortalama hesapla
        for (int i = 0; i < sayilar.length; i++) {
            satirToplami = 0;
            for (int j = 0; j < sayilar[i].length; j++) {
                satirToplami += sayilar[i][j];
            }
            // ortalama bul
            ortalama = satirToplami / sayilar[i].length; // ortalama = satirToplami/sutunSayisi;
            System.out.println("Ortalama=" + ortalama);
        }

    }
}

import java.util.Scanner;

public class d5 {
    public static void main(String[] args) {
        // 1 haftaya ait sıcaklık bilgilerini içerisinde barındırabilecek bir dizi
        // tanımlayınız. Klavyeden bu dizinin elemanlarına veri girişi yapınız. Ardından
        // sıcaklık ortalamasını hesaplayıp ekrana yazdırınız.

        int[] sicaklik = new int[7];
        double toplam = 0, ortalama = 0;

        Scanner giris = new Scanner(System.in);
        // sıcaklık veri girisi
        for (int i = 0; i < sicaklik.length; i++) {
            System.out.print("Sıcaklık Gir:");
            sicaklik[i] = giris.nextInt();
        }
        // sicaklıkları topla
        for (int i = 0; i < 7; i++)
            toplam += sicaklik[i];

        // ortalama bul
        ortalama = toplam / 7;      // ortalama = toplam / sayilar.length;

        System.out.println(ortalama);

    }
}

import java.util.Scanner;

public class d4 {
    public static void main(String[] args) {
        // 2. Satır ve sütun sayısı klavyeden girilecek iki boyutlu sayısal diziye
        // 50-100 arasında rastgele sayılardan değer atanacaktır. Değer atandıktan sonra
        // her bir satırın aritmetik ortalamasını bulup ekrana yazdıran programı
        // yazınız.

        int satirSayisi,sutunSayisi;
        double satirToplam=0,ortalama;

        int[][] sayilar;

        Scanner giris=new Scanner(System.in);

        System.out.println("Satır Sayısı Gir:");
        satirSayisi = giris.nextInt();

        System.out.println("Sutun Sayısı Gir:");
        sutunSayisi = giris.nextInt();

        //DİNAMİk dizi tanımlaması, eleman sayısı belirlendi
        sayilar = new int[satirSayisi][sutunSayisi];

        //değer atama ve ekrana yazdırma
        System.out.println("Oluşturulan Dizi");
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                sayilar[i][j] = 50 + (int)(Math.random()*50);
                System.out.print(sayilar[i][j]+"\t");
            }
            System.out.println();
        }

        //Aritmatik ortalamasını hesapla
        for (int i = 0; i < sayilar.length; i++) {
            satirToplam = 0;
            for (int j = 0; j < sayilar[i].length; j++) {
                satirToplam += sayilar[i][j];
            }
            //ortalama hesapla
            ortalama = satirToplam / sutunSayisi;
            System.out.println((i+1)+".Satır Aritmatik Ortalaması= "+ortalama);
        }





    }
}

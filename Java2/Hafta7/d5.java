import java.util.Scanner;

public class d5 {
    public static void main(String[] args) {
        // 1. 1 haftaya ait sıcaklık bilgilerini içerisinde barındırabilecek bir dizi
        // tanımlayınız. Klavyeden bu dizinin elemanlarına veri girişi yapınız. Ardından
        // sıcaklık ortalamasını hesaplayıp ekrana yazdırınız.

        int[] sicaklik = new int[7];
        double toplam = 0;
        double ortalama = 0;
        Scanner giris=new Scanner(System.in);

        //veri girişi
        for (int i = 0; i < sicaklik.length; i++) {
            System.out.print((i+1)+". Sıcaklık Gir:");
            sicaklik[i] = giris.nextInt();
        }
        //sıcaklıkları topla
        for (int i = 0; i < sicaklik.length; i++) 
            toplam += sicaklik[i];

        //ortalama hesapla
        ortalama = toplam / 7; // ortalama = toplam / sicaklik.length;

        System.out.println("Sıcaklık Ortalaması = "+ ortalama);
    }
}

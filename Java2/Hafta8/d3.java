import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {

        int satirToplami = 0;

        int sayilar[][] = { { 99, 37, 15, 51, 20, 78, 99, 33, 92, 41 },
                { 98, 93, 41, 19, 27, 93, 63, 36, 63, 28 },
                { 23, 20, 50, 56, 28, 79, 81, 39, 33, 49 },
                { 33, 36, 58, 92, 47, 32, 74, 32, 23, 26 },
                { 92, 88, 78, 68, 65, 81, 26, 89, 23, 54 },
                { 94, 61, 41, 84, 40, 79, 79, 84, 49, 21 },
                { 80, 76, 83, 54, 55, 57, 75, 44, 11, 26 },
                { 10, 35, 77, 57, 14, 79, 37, 39, 88, 23 },
                { 84, 32, 34, 81, 81, 53, 71, 39, 62, 39 } };

                System.out.println("Dizinin Satır ve Sutun Bilgisi = "+sayilar.length+" x "+sayilar[0].length);

        for (int i = 0; i < sayilar.length; i++) {// satır sayısı kadar dön, satırlarda dolaşmak için
            for (int j = 0; j < sayilar[i].length; j++) {// sıradaki satırın eleman sayısı, sıradaki satırın sutun
                                                             // sayısı, sıradaki satırın sutunlarında dolaşmak için
                System.out.print(sayilar[i][j] + "\t");
            }
            System.out.println();
        }

        //a. Her bir satırının ayrı ayrı toplamını bulup ekrana yazdırınız.
        for (int i = 0; i < sayilar.length; i++) {
            satirToplami = 0;//Bu satır ÇOK ÖNEMLİ
            for (int j = 0; j < sayilar[i].length; j++) {//sıradaki satırın sutun sayısı kadar olmalı
                satirToplami += sayilar[i][j];
            }
            System.out.println("Toplam= "+satirToplami);
        }
        System.out.println();
        //a. Her bir satırının ayrı ayrı toplamını bulup ekrana yazdırınız.
        for (int i = 0; i < sayilar.length; i++) {
            satirToplami = 0;//Bu satır ÇOK ÖNEMLİ
            for (int j = 0; j < sayilar[i].length; j++) {//sıradaki satırın sutun sayısı kadar olmalı
                satirToplami += sayilar[i][j];
            }
            System.out.println((i+1)+".Satır Toplamı= "+satirToplami);
        }

        System.out.println();
        //b. Her bir sütunun ayrı ayrı toplamını bulup ekrana yazdırınız.
        int sutunToplami = 0;
        for(int sutunIndex = 0; sutunIndex<sayilar[0].length;sutunIndex++){//sutun sayısı kadar dön}
            sutunToplami = 0;
            for(int satirIndex = 0; satirIndex<sayilar.length;satirIndex++){//satırsayısı kadar dön
                sutunToplami += sayilar[satirIndex][sutunIndex];
            }
            System.out.println((sutunIndex+1)+".Sutun Toplamı= "+sutunToplami);
        }

        //c. Dizi elemanlarından değeri klavyeden girilecek bir sayısal değerden büyük olanları 0 yapınız.
        System.out.println();
        int sinir ;
        Scanner giris= new Scanner(System.in);
        System.out.println("Bir sınır değeri giriniz:");
        sinir = giris.nextInt();

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if(sayilar[i][j]>sinir)
                    sayilar[i][j] = 0;
            }
        }

        for (int i = 0; i < sayilar.length; i++) {// satır sayısı kadar dön, satırlarda dolaşmak için
            for (int j = 0; j < sayilar[i].length; j++) {// sıradaki satırın eleman sayısı, sıradaki satırın sutun
                                                             // sayısı, sıradaki satırın sutunlarında dolaşmak için
                System.out.print(sayilar[i][j] + "\t");
            }
            System.out.println();
        }





    }
}

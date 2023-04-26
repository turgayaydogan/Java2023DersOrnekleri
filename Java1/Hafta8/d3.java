import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {
        int satirToplam=0;
        int sutunToplam=0;
        int sinir=0;
        Scanner giris=new Scanner(System.in);

        int sayilar[][] = { { 99, 37, 15, 51, 20, 78, 99, 33, 92, 41 },
                { 98, 93, 41, 19, 27, 93, 63, 36, 63, 28 },
                { 23, 20, 50, 56, 28, 79, 81, 39, 33, 49 },
                { 33, 36, 58, 92, 47, 32, 74, 32, 23, 26 },
                { 92, 88, 78, 68, 65, 81, 26, 89, 23, 54 },
                { 94, 61, 41, 84, 40, 79, 79, 84, 49, 21 },
                { 80, 76, 83, 54, 55, 57, 75, 44, 11, 26 },
                { 10, 35, 77, 57, 14, 79, 37, 39, 88, 23 },
                { 84, 32, 34, 81, 81, 53, 71, 39, 62, 39 },
                { 89, 45, 20, 93, 18, 90, 98, 32, 16, 17 } };
        
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j]+"\t");
            }
            System.out.println();
        }

        //a. Her bir satırının ayrı ayrı toplamını bulup ekrana yazdırınız.
        for (int i = 0; i < sayilar.length; i++) {
            satirToplam = 0;
            for (int j = 0; j < sayilar[i].length; j++) {
                satirToplam+= sayilar[i][j];
            }
            System.out.println((i+1)+".Satır Toplamı="+satirToplam);
        }

        //b. Her bir sütunun ayrı ayrı toplamını bulup ekrana yazdırınız.
        //DİKKAT ilk önce 1.sutun toplanacak sonra 2. vb.
        System.out.println();
        for(int sutunIndex=0;sutunIndex<sayilar[0].length;sutunIndex++){
            sutunToplam = 0;
            for(int satirIndex=0;satirIndex<sayilar.length;satirIndex++){
                sutunToplam += sayilar[satirIndex][sutunIndex];
            }
            System.out.println((sutunIndex+1)+".Sutun Toplamı="+sutunToplam);
        }

        //c. Dizi elemanlarından değeri klavyeden girilecek bir sayısal değerden büyük olanları 0 yapınız.
        //1 adet eşik değeri belirlenecek, bu değerden büyük olanlar 0 olacak
        System.out.print("Bir sınır değeri giriniz:");
        sinir = giris.nextInt();

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if(sayilar[i][j]>sinir)
                    sayilar[i][j] = 0;  //sıradaki eleman değeri klavyeden girilecek bir sayısal değerden büyük olanları 0 yap
            
            }
        }

        //Dizinin yeni değerine göre elemanları ekrana yazdır
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j]+"\t");
            }
            System.out.println();
        }


    }
}

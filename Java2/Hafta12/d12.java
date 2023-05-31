import java.util.Scanner;

public class d12 {
    public static void main(String[] args) {
          // int dizi tanımla
        // 1. veri girişi ile dizinin hangi elemanını ekrana yazdırmak istediğini sor
        // 2. veri girişi ile dizinin 1.elemanını kaça bölünmesini istediğini sor

        try {
            int[] sayilar = {10,20,30,40,50};

            Scanner giris =new Scanner(System.in);

            int girilenIndex,bolen;

            System.out.print("Dizi Index numarası gir:");
            girilenIndex = giris.nextInt();

            System.out.print("Bolen sayısı gir:");
            bolen = giris.nextInt();

            System.out.println(sayilar[girilenIndex]);


            int sonuc = sayilar[0] / bolen;
            System.out.println(sonuc);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizi elemanı ile ilgili bir hata oluştu, lütfen tekrar deneyiniz");
        } catch (ArithmeticException e){
            System.out.println("Bölen için farklı bir sayı giriniz");
        }
    }
}

import java.util.Scanner;

public class d11 {
    public static void main(String[] args) {
        // kullanıcıya 2 adet veri girişi yapılacak
        // 1.veri girişi ekrana yazdırmak istediği dizinin index numarası
        // 2.veri dizinin 1.elemanı yani index numarası 0 olan elemanı hangi tam sayıya bölmek istiyor
        try {
            int[] sayilar ={10,20,30,40,50};
            Scanner giris=new Scanner(System.in);
            int elemanIndex,bolen;

            System.out.print("Ekrana yazdırmak istedğiniz dizi index i gir:");
            elemanIndex = giris.nextInt();

            System.out.print("Bölmek istediğiniz sayıyı gir:");
            bolen = giris.nextInt();

            System.out.println(sayilar[elemanIndex]);

            int sonuc = sayilar[0]/bolen;
            System.out.println(sonuc);

        } catch (ArithmeticException e) {
            System.out.println("Lütfen programı tekrar çalıştırıp 0 dan farklı sayı giriniz");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Lütfen programı tekrar çalıştırıp daha küçük bir index değeri giriniz.");
        }
    }
}

import java.util.Scanner;

public class d12 {
    public static void main(String[] args) {
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
        } catch (Exception e) {
            System.out.println("Bir hata oluştu, lütfen programı tekrar çalışırınız ve giriş verilerinizi kontrol ediniz.");
        }
    }
}

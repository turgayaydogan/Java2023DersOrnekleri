import java.util.Scanner;

public class d7 {
    public static void main(String[] args) {
        int sayi1,sayi2,sonuc;

        Scanner giris=new Scanner(System.in);

        System.out.print("1.Sayıyı Gir:");
        sayi1 = giris.nextInt();

        System.out.print("2.Sayıyı Gir:");
        sayi2 = giris.nextInt();

        sonuc = sayi1 + sayi2;

        System.out.println("Toplam sonuc="+ sonuc);
        
        
    }
}

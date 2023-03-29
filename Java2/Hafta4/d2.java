import java.util.Scanner;

public class d2 {
    public static void main(String[] args) {
        int sayi, kalan;

        Scanner giris = new Scanner(System.in);

        System.out.println("Sayıyı Gir:");
        sayi = giris.nextInt();

        kalan = sayi % 2; // sayının 2 e bölümünden kalanını hesapla

        if (kalan == 0)
            System.out.println("Sayı Çift");
        else
            System.out.println("Sayı Tek");
    }
}

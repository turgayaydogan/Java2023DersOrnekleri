import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {
        int sayi, kalan;

        Scanner giris = new Scanner(System.in);

        System.out.println("Sayıyı Gir:");
        sayi = giris.nextInt();

        //kalan = sayi % 2; // sayının 2 e bölümünden kalanını hesapla

        if ((kalan = sayi % 2) == 0)
            System.out.println("Sayı Çift");
        else
            System.out.println("Sayı Tek");
    }
}

import java.util.Scanner;

public class d17 {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner giris = new Scanner(System.in);
        do {
            System.out.println("Sayı:");
            sayi = giris.nextInt();

            toplam += sayi;

        } while (toplam < 21);

        System.out.println("Sayıların Toplamı=" + toplam);

    }
}

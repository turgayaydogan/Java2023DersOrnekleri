import java.util.Scanner;

public class d19 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi, toplam = 0;
        double ortalama;

        for (int i = 0; i < 5; i++) {
            System.out.println("Sayı:");
            sayi = giris.nextInt();

            toplam += sayi;
        }

        ortalama = toplam / 5.0; // 5 sayının aritmetik ortalaması burada int/int yaparsanız sonuc int çıkar
                                 // DİKKAT veya değişkenlerin hepsi double tanımlanacak
        System.out.println("Ortalama=" + ortalama);
    }
}

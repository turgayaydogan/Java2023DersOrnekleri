import java.util.Scanner;

public class d18 {
    public static void main(String[] args) {
        // 7. Klavyeden negatif sayı girilinceye kadar 10 ve 10 dan büyük sayıları
        // toplayan ve
        // bu sayıların âdetini bulan program,

        // pozitif ==> toplam ve adet
        // 0-9
        // negatif

        int toplam = 0, adet = 0, sayi;

        Scanner giris = new Scanner(System.in);

        do {
            System.out.print("Sayı Gir:");
            sayi = giris.nextInt();

            if (sayi >= 10) {
                toplam += sayi;
                adet++;
            }
        } while (sayi >= 0);

        System.out.println("Toplam="+toplam);
        System.out.println("Adet="+adet);
    }
}

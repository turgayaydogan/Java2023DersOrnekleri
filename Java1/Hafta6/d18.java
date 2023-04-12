import java.util.Scanner;

public class d18 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int adet = 0, toplam = 0, sayi;

        for (int i = 0; i < 10; i++) {// 10 kere dönen döngü
            System.out.println("Sayı:");
            sayi = giris.nextInt();

            // negatif sayıların adeti
            if (sayi<0)
                adet++;

            if(sayi>0)
                toplam+=sayi;
        }

        System.out.println("Negatif Sayı Adeti="+adet);
        System.out.println("Pozitif Sayı Toplamı="+toplam);

    }
}

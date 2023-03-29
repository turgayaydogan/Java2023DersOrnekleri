import java.util.Scanner;

public class d11 {
    public static void main(String[] args) {
        // klavyeden girilen başlangıç ve bitiş değeri arasında 8'in katı olup 5'in katı
        // olmayan sayıları ekrana yazdır.
        // sayı 8 bölünebilecek ama 5 e bölünemeyecek
        // baslangic sayısının bitis sayısından küçük olduğunu varsayınız

        int baslangic, bitis, kalan1, kalan2;

        Scanner giris = new Scanner(System.in);

        System.out.println("Başlangıç Sayısı:");
        baslangic = giris.nextInt();

        System.out.println("Bitiş Sayısı:");
        bitis = giris.nextInt();

        do {

            kalan1 = baslangic % 8;
            kalan2 = baslangic % 5; // 1,2,3,4 ==> kalan2!=0

            if (kalan1 == 0 && kalan2 != 0)
                System.out.println(baslangic);

            baslangic++;

        } while (baslangic <= bitis);

    }
}

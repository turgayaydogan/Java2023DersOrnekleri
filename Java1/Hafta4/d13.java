import java.util.Scanner;

public class d13 {
    public static void main(String[] args) {
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
                System.out.println(baslangic);// bu satır şarta bağlı
                baslangic++;                    // bu satır bağımsız herhangi bir şarta bağlı değil

        } while (baslangic <= bitis);
    }
}

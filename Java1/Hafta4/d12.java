import java.util.Scanner;

public class d12 {
    public static void main(String[] args) {
        int baslangic, bitis, kalan1, kalan2;

        Scanner giris = new Scanner(System.in);

        System.out.println("Başlangıç Sayısı:");
        baslangic = giris.nextInt();

        System.out.println("Bitiş Sayısı:");
        bitis = giris.nextInt();

        do {

            if ( (baslangic % 8 == 0) && (baslangic % 5 != 0) )
                System.out.println(baslangic);

            baslangic++;

        } while (baslangic <= bitis);
    }
}

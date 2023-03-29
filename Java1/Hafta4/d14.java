import java.util.Scanner;

public class d14 {
    public static void main(String[] args) {
        int baslangic, bitis, kalan1, kalan2;

        Scanner giris = new Scanner(System.in);

        System.out.println("Başlangıç Sayısı:");
        baslangic = giris.nextInt();           // 1

        System.out.println("Bitiş Sayısı:");
        bitis = giris.nextInt();               // 10

        do {

            kalan1 = baslangic % 8;
            kalan2 = baslangic % 5; // 1,2,3,4 ==> kalan2!=0

            if (kalan1 == 0 && kalan2 != 0) {
                System.out.println(baslangic); // şarta bağlı

                baslangic++;                    // şarta bağlı
            }
        
        } while (baslangic <= bitis);// şart her zaman doğru olur eğer baslangic=1 ve bitis=10 girilirse şart 1<=10 dan sürekli doğru
        //sonsuz döngü
    }
}

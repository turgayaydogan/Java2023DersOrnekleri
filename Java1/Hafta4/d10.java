import java.util.Scanner;

public class d10 {
    public static void main(String[] args) {
        // 0 dan klavyeden girilen değere kadar aradaki sayılardan 7 nin katlarını ekrana yazdır

        int baslangic=0,bitis;
        int kalan;

        Scanner giris=new Scanner(System.in);

        System.out.println("Bitiş Sayısını Gir:");
        bitis=giris.nextInt();

        do {
            kalan = baslangic % 7;
            if(kalan==0)//sıradaki sayı 7 e tam bölünebilir, 7 e bölümünden kalan 0
                System.out.println(baslangic);
            
            baslangic++;// sradaki sayı bir sonraki sayı oldu bitiş değerine doğru ilerliyoruz
        } while (baslangic<=bitis); //bitişe gelip gelmediğimi kontrol et





    }
}

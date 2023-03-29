public class d7 {
    public static void main(String[] args) {
        // 0-100 arasında tek sayıları ekrana yazdırmak istiyorum

        // sıradaki sayının tek sayı olup olmadığı kontrol et.
        // eğer sıradaki sayı tek sayı ise ekrana yazdır
        // eğer sıradaki sayı tek sayı değilse ekrana yazdırmayacağız
        // sıradaki sayıyı 1 arttıracağız
        // 100 olana kadar devam edecek

        /*
        int i=1;
        do {
            System.out.println(i);
            i = i + 2;
        } while (i<100);

        */


        int sayi = 0;
        do {

            int kalan = sayi % 2;           // sıradaki sayının tek sayı olup olmadığı kontrol et.
            if(kalan==1){//tek sayı         // eğer sıradaki sayı tek sayı ise ekrana yazdır
                System.out.println(sayi);
            }

            sayi++;                         // sıradaki sayıyı 1 arttıracağız
            
        } while (sayi<=100);                 // 100 olana kadar devam edecek

    }
}

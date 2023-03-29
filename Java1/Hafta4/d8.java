public class d8 {
    public static void main(String[] args) {
        int sayi = 0;
        
        while (sayi <= 100) { // 100 olana kadar devam edecek

            int kalan = sayi % 2; // sıradaki sayının tek sayı olup olmadığı kontrol et.
            if (kalan == 1) {// tek sayı // eğer sıradaki sayı tek sayı ise ekrana yazdır
                System.out.println(sayi);
            }

            sayi++; // sıradaki sayıyı 1 arttıracağız

        }
    }
}

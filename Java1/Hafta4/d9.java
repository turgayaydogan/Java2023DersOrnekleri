public class d9 {
    public static void main(String[] args) {
        
        
        for (int sayi = 0; sayi <= 100; sayi++) {
            int kalan = sayi % 2; // sıradaki sayının tek sayı olup olmadığı kontrol et.
            if (kalan == 1) {// tek sayı // eğer sıradaki sayı tek sayı ise ekrana yazdır
                System.out.println(sayi);
            }
        }
    }
}

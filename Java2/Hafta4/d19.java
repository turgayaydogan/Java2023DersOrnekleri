public class d19 {
    public static void main(String[] args) {
        // 0 dan başla
        // her bir sayının tek sayı olup olmadığı bul
        // sayının 2 e bölümünden kalanını hesapla
        // eğer kalan 1 ise sayı tekdir ekrana yazdır
        // eğer kalan 0 ise sayı çifttir ekrana yazdırma
        // bir sonraki sayıya git
        // sayı değerini 1 arttır
        // 100 e ulaşıncaya kadar devam et
        int sayi = 0;
        do {
            int kalan = sayi % 2;           //sayının 2 e bölümünden kalanını hesapla
            if (kalan == 1) {               // sayı tek sayıdır
                System.out.println(sayi);   //eğer kalan 1 ise sayı tekdir ekrana yazdır
            }
            sayi++;                         //bir sonraki sayıya git

        } while (sayi < 100);
    }
}

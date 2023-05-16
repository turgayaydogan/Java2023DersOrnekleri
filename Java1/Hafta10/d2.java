public class d2 {
    public static void main(String[] args) {
        asalSayiListele(5, 20);
    }

    static void asalSayiListele(int sayi1, int sayi2) {
        // her bir sayının tam bölenini bul
        // eğer tam bölen adeti 2 ise o sayı asal sayıdır

        for (int i = sayi1; i <= sayi2; i++) {
            // her bir sayı, siradaki sayı bilgigi i değişkeninde

            // 1 den i e kadar i nin tam bölenlerini bul
            // eğer tam bölen adeti 2 ise i asal sayıdır

            int adet = 0;

            for (int j = 1; j <= i; j++) {
                int kalan = i % j;
                if (kalan == 0)// i sayısı j tam bölünür
                    adet++;
            }

            if (adet == 2)
                System.out.println(i+" sayısı Asal Sayıdır");

        }

    }
}

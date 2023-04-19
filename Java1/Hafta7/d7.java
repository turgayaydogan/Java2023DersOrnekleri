public class d7 {
    public static void main(String[] args) {
        // 100 elemanlı bir diziye 1-200 arasında rastgele sayılar üreterek aktaran, bu
        // sayılar üzerinde;
        // a1)elemanları ekrana yazdırın
        // a)100'den büyük sayıların sayısını bulan
        // b)100'den küçük sayıların ortalamasını bulan
        // c)Çift sayıların sayısını bulan

        // int tututalSayi = (int) (Math.random() * 100);

        int[] sayilar = new int[100];
        int adet1 = 0;
        int adet2 = 0;// b maddesi için
        double toplam = 0, ortalama = 0;// b maddesi için

        int adet3 = 0;// c için

        // değer ataması
        for (int i = 0; i < 100; i++)
            sayilar[i] = (int) (Math.random() * 200);

        // ekrana yazdırma
        for (int i = 0; i < 100; i++)
            System.out.println((i + 1) + ".Eleman= " + sayilar[i]);

        // 100 den büyük olanların sayısını bul
        for (int i = 0; i < sayilar.length; i++)
            if (sayilar[i] > 100)
                adet1++;

        System.out.println("100 den büyük eleman sayısı=" + adet1);

        // 100'den küçük sayıların ortalamasını bulan
        // 100'den küçük sayıların adet ve toplamına ihtiyaç var
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < 100) {
                toplam += sayilar[i];
                adet2++;
            }
        }

        ortalama = toplam / adet2;

        System.out.println("Ortalama=" + ortalama);

        // c)Çift sayıların sayısını bulan
        for (int i = 0; i < sayilar.length; i++)
            if ((sayilar[i] % 2) == 0)// çift sayıdır
                adet3++;

        System.out.println("Çift Sayı Adeti=" + adet3);

        // veya
        // c)Çift sayıların sayısını bulan
        adet3 = 0;
        for (int i = 0; i < sayilar.length; i++) {
            int kalan = sayilar[i] % 2;
            if (kalan == 0)// çift sayıdır
                adet3++;
        }

        System.out.println("Çift Sayı Adeti=" + adet3);

    }
}

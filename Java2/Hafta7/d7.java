public class d7 {
    public static void main(String[] args) {
        // 2. 100 elemanlı bir diziye 1-200 arasında rastgele sayılar üreterek aktaran,
        // bu sayılar üzerinde;
        // a1)atanan sayılar ekrana yazdırılsın
        // a)100'den büyük sayıların sayısını bulan
        // b)100'den küçük sayıların ortalamasını bulan
        // c)Çift sayıların sayısını bulan

        int[] sayilar = new int[100];
        int adet1 = 0;
        int adet2 = 0;// b için
        double toplam = 0, ortalama;// b için

        int adet3 = 0;// ciçin

        // rastgele eleman atama
        for (int i = 0; i < sayilar.length; i++)
            sayilar[i] = (int) (Math.random() * 200);

        // yazdırma işlemi
        for (int i = 0; i < sayilar.length; i++)
            System.out.println((i + 1) + ". Eleman = " + sayilar[i]);

        // a)100'den büyük sayıların sayısını bulan
        for (int i = 0; i < sayilar.length; i++)
            if (sayilar[i] > 100)
                adet1++;

        System.out.println("100 den büyük sayı adeti=" + adet1);

        // b)100'den küçük sayıların ortalamasını bulan
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] < 100) {
                toplam += sayilar[i];
                adet2++;
            }
        }

        ortalama = toplam / adet2;
        System.out.println("100 den küçük sayı ortalaması=" + ortalama);

        // c)Çift sayıların sayısını bulan
        for (int i = 0; i < sayilar.length; i++)
            if ((sayilar[i] % 2) == 0)// çift sayıdır
                adet3++;

        System.out.println("Çift sayı adeti= " + adet3);

        // veya
        // c)Çift sayıların sayısını bulan
        adet3 = 0;
        for (int i = 0; i < sayilar.length; i++) {
            int kalan = sayilar[i] % 2;
            if (kalan == 0)
                adet3++;
        }
        System.out.println("Çift sayı adeti= " + adet3);

    }
}

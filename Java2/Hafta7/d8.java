public class d8 {
    public static void main(String[] args) {
        // 4. Elemanları 1-100 arasında rastgele değerler olan int türden 20 elemanlı
        // bir dizideki elemanların sayısal ortalamasını, en büyük değerini, en küçük
        // değerini bulan programı yazınız.

        // 1.diziye rastgele eleman ata
        // 2.elemanları ekrana yazdır
        // 3.en büyük elemanı bul ve akrana yazdır

        // EN BÜYÜK ELEMAN BUL
        // 1.elamanı en büyük sayı (EBS) olarak ata
        // sıradaki elemanı EBS ile kıyasla
        // eğer sıradaki eleman EBS dan büyük ise artık EBS sıradaki eleman
        // olsun(sıradaki elemanı EBS olarak ata)
        // bu işlemi dizinin son elemanına kadar kontrol et

        int[] sayilar = new int[20];
        int EBS = 0;

        // 1.diziye rastgele eleman ata
        // 2.elemanları ekrana yazdır

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = (int) (Math.random() * 100);
            System.out.println((i + 1) + ".Eleman = " + sayilar[i]);
        }

        // 3.en büyük elemanı bul ve akrana yazdır
        // 1.yöntem

        EBS = sayilar[0];// 1.elamanı en büyük sayı (EBS) olarak ata
        for (int i = 0; i < sayilar.length; i++) {//DİKKAT istersen i=1
            // sıradaki elemanı EBS ile kıyasla
            if (sayilar[i] > EBS)// eğer sıradaki eleman EBS dan büyük ise artık EBS sıradaki eleman
                EBS = sayilar[i];// olsun(sıradaki elemanı EBS olarak ata)

        }

        System.out.println("EBS= "+EBS);

    }
}

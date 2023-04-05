public class d20 {
    public static void main(String[] args) {
        // 12. 2015 yılı itibarı ile ülke nüfusu 77 milyondur. Yıllık nüfus artış oranı
        // %1.3 tür. Sonraki 10 yılda ülke nüfusunu yıllara göre hesaplayıp yıl yıl
        // ekrana yazdıran programın kodlarını
        // yazınız,

        // 100 %10 ==> 110, 100 %1 ==>101

        double nufus = 77;

        for (int yil = 1; yil <= 10; yil++) {// 10 sefer donen bir dongu
            double artis = (nufus / 100) * 1.3;
            double yeniNufus = nufus + artis;
            System.out.println(yil + ".Yıl Nüfusu= " + yeniNufus + " milyon");

            nufus = yeniNufus;
        }
        System.out.println("Çözüm 2:");
        nufus = 77; // aynı sayfada 2 farklı çözüm yapıldığı için nufu değeri tekrar 77 den
                    // başlatıldı
        // 2.çözüm
        for (int yil = 1; yil <= 10; yil++) {// 10 sefer donen bir dongu
            double artis = (nufus / 100) * 1.3;
            nufus = nufus + artis;
            System.out.println(yil + ".Yıl Nüfusu= " + nufus + " milyon");
        }
        System.out.println("Çözüm 3:");
        nufus = 77; // aynı sayfada 2 farklı çözüm yapıldığı için nufu değeri tekrar 77 den
                    // başlatıldı
        // 3.çözüm
        for (int yil = 0; yil < 10; yil++) {// 10 sefer donen bir dongu
            double artis = (nufus / 100) * 1.3;
            nufus = nufus + artis;
            System.out.println((yil+1) + ".Yıl Nüfusu= " + nufus + " milyon");
        }
    }
}

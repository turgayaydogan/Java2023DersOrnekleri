public class d13 {
    public static void main(String[] args) {
        // 2015 yılı itibarı ile ülke nüfusu 77 milyondur. Yıllık nüfus artış oranı %1.3
        // tür. Sonraki 10 yılda ülke nüfusunu yıllara göre programın kodlarını yazınız.

        // sayının % değerinin hesaplanması

        double nufus = 77;
        //1.yöntem
        for (int yil = 1; yil <= 10; yil++) {// 10 sefer donen bir döngü
            double artis = (nufus/100)*1.3;
            double yeniNufus = nufus + artis;
            System.out.println(yil+".Yıl sonundaki nüfus= "+yeniNufus);

            nufus = yeniNufus;
        }
        System.out.println("************************");
        //2.yöntem
        nufus = 77; // aynı sayfada birden fazla çözüm yaptığımız için nufus değerini tekrar 77 olarak atadık
        for (int yil = 1; yil <= 10; yil++) {// 10 sefer donen bir döngü
            double artis = (nufus/100)*1.3;
            nufus = nufus + artis;
            System.out.println(yil+".Yıl sonundaki nüfus= "+nufus);
        }
        System.out.println("************************");
        //3.yöntem
        nufus = 77; // aynı sayfada birden fazla çözüm yaptığımız için nufus değerini tekrar 77 olarak atadık
        for (int i = 0; i < 10; i++) {// 10 sefer donen bir döngü
            double artis = (nufus/100)*1.3;
            nufus = nufus + artis;
            System.out.println((i+1)+".Yıl sonundaki nüfus= "+nufus);
        }

    }
}

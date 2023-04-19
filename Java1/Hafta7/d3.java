public class d3 {
    public static void main(String[] args) {
        int[] sayilar1 = new int[] { 5, 4, 9, 7, 8 };
        int[] sayilar2 = { 5, 4, 9, 7, 8 };

        int sayilar3[] = new int[] { 5, 4, 9, 7, 8 };
        int sayilar4[] = { 5, 4, 9, 7, 8 };

        System.out.println(sayilar4[0]);// index numarası bilgisi int veritipinde bilgidir
        System.out.println(sayilar4[1]);
        System.out.println(sayilar4[2]);
        System.out.println(sayilar4[3]);
        System.out.println(sayilar4[4]);

        System.out.println("Döngü ile ekrana yazdırma");
        for (int i = 0; i < 5; i++) {
            System.out.println(sayilar4[i]);// i değişkeni içerisinde index/dizielamanısıranumarası bilgisi vardır
        }

        System.out.println("Döngü ile ekrana yazdırma 2 ");
        // sayilar4.length = sayilar4 dizisinin uzunluğunu yani eleman sayısı bilgisini
        // verir
        System.out.println("sayilar4 dizisinin eleman sayısı:" + sayilar4.length);
        for (int i = 0; i < sayilar4.length; i++) {
            System.out.println(sayilar4[i]);// i değişkeni içerisinde index/dizielamanısıranumarası bilgisi vardır
        }

        System.out.println("Döngü ile ekrana yazdırma 3 ");
        for (int i = 0; i < sayilar4.length; i++) {
            System.out.println((i+1) + ".eleman=" + sayilar4[i]);
        }

        //NEDEN HATA VERDİ
        System.out.println("Döngü ile ekrana yazdırma 3 ");
        for (int i = 0; i < sayilar4.length; i++) {
            System.out.println(++i + ".eleman=" + sayilar4[i]);
        }

    }
}

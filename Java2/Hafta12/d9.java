public class d9 {
    public static void main(String[] args) {
        try {// Hata oluşturabilecek kodların yazıldığı blok
            int[] sayilar = { 10, 20, 30, 40, 50 };
            System.out.println(sayilar[0]);
            System.out.println(sayilar[4]);
            
            int sonuc = sayilar[4]/0;// HATA 0 a bölüm hatası
            System.out.println(sonuc);

            System.out.println(sayilar[5]);
            System.out.println(sayilar[4]);

        } catch (ArrayIndexOutOfBoundsException e) {// Dizi ile ilgili ulaşılamayacak eleman Hata oluştuğunda çalışacak kodlar
            System.out.println("Bir hata oluştu, lütfen programı tekrar çalıştırınız. :(");
           
        } finally {// Hata ister olsun isterse olmasın bu blok çalışır
            System.out.println("En sonunda çalışır");
        }
    }
}

public class d7 {
    public static void main(String[] args) {
        try {// Hata oluşturabilecek kodların yazıldığı blok
            int[] sayilar = { 10, 20, 30, 40, 50 };
            System.out.println(sayilar[4]);
            System.out.println(sayilar[5]);//HATA

        } catch (Exception e) {// Hata oluştuğunda çalışacak kodlar
            System.out.println("Bir hata oluştu, lütfen programı tekrar çalıştırınız. :(");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        } finally {// Hata ister olsun isterse olmasın bu blok çalışır
            System.out.println("En sonunda çalışır");
        }
    }
}

public class d2 {

    public static void main(String[] args) {

        int[] sayilar = { 10, 20, 30, 40, 50 };

        try {// Hata oluşturabilecek kodların yazıldığı blok
            System.out.println(sayilar[4]);
            System.out.println(sayilar[5]);

        } catch (Exception e) {// Hata oluştuğunda çalışacak kodlar
            System.out.println("Bir hata oluştu, lütfen programı tekrar çalıştırınız. :(");
        }
    }
}
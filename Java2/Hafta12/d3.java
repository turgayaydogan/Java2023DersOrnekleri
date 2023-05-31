public class d3 {
    public static void main(String[] args) {

        try {// Hata oluşturabilecek kodların yazıldığı blok
            int[] sayilar = { 10, 20, 30, 40, 50 };
            System.out.println(sayilar[4]);
            System.out.println(sayilar[5]);

        } catch (Exception e) {// Hata oluştuğunda çalışacak kodlar
            System.out.println("Bir hata oluştu, lütfen programı tekrar çalıştırınız. :(");
        }
    }
}

public class d5 {
    public static void main(String[] args) {
        try {// Hata oluşturabilecek kodların yazıldığı blok
            int[] sayilar = { 10, 20, 30, 40, 50 };
            System.out.println(sayilar[4]);
            System.out.println(sayilar[5]);

        } catch (Exception ee) {// Hata oluştuğunda çalışacak kodlar
            System.out.println("Bir hata oluştu, lütfen programı tekrar çalıştırınız. :(");
            System.out.println(ee.getMessage());
            System.out.println(ee.toString());
            ee.printStackTrace();
        }
    }
}
